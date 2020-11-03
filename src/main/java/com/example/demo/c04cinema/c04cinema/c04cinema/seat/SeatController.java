package com.example.demo.c04cinema.c04cinema.c04cinema.seat;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallController;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPointManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.generated.GeneratedSeatController;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.model_dto.SeatDTO;
import com.speedment.common.tuple.Tuple4;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SeatController extends GeneratedSeatController {
    private static final Log log = LogFactory.getLog(HallController.class);

    @Autowired
    BookingTicketManager bookingTicketManager;
    @Autowired
    PromoPointManager pointManager;
    @Autowired
    JoinComponent joinComponent;
    @Autowired
    private SeatManager seatManager;

    @GetMapping("/seatShow/{showId}")
    public List<SeatDTO> searchByShowlId(@PathVariable int showId){
        Join<Tuple4<Seat, SeatType, Hall, Show>> join= joinComponent.from(SeatManager.IDENTIFIER)
                .innerJoinOn(SeatType.ID).equal(Seat.SEAT_TYPE_ID)
                .innerJoinOn(Hall.ID).equal(Seat.HALL_ID)
                .innerJoinOn(Show.HALL_ID).equal(Hall.ID).where(Show.ID.equal(showId))
                .build(Tuples::of);

        List<SeatDTO> seatDTOList= new ArrayList<>();
        join.stream().forEach(e->{
            int id= e.get0().getId();
            int promotion_point_id= e.get1().getPromoPointId().getAsInt();
            int bonus_seat_point=   pointManager.stream().filter(PromoPoint.ID.equal(promotion_point_id)).mapToInt(PromoPoint.BONUS_POINT.asInt()).findFirst().getAsInt() ;
            String name= e.get0().getName().get();
            double price = e.get1().getPrice().getAsDouble();
            String color= e.get1().getColor().get();
            boolean isAvailable= bookingTicketManager.stream().filter(f -> f.getSeatId().getAsInt()== id && f.getShowId().getAsInt()==showId).count()<=0;
            SeatDTO seatDTO= new SeatDTO(id, bonus_seat_point,name,price, color, isAvailable);
            seatDTOList.add(seatDTO);
        });

        return seatDTOList;
    }

    @GetMapping("/seat/list")
    public List<Seat> getSeatsByHallId(@RequestParam int hallId){
        List<Seat> seatList;
        try {
            seatList= seatManager.stream().filter(Seat.HALL_ID.equal(hallId)).collect(Collectors.toList());
            return seatList;
        }catch (Exception e){
            log.error("Lỗi tại vị trí seatController" + e.getMessage());
            return seatList = null;
        }
    }

    @GetMapping("/getSeatNameById/{id}")
    public Seat getSeatById(@PathVariable int id){
      return  seatManager.stream().filter(Seat.ID.equal(id)).findFirst().get();
    }

    @GetMapping("/seat/create")
    public void addSeats(@RequestParam int hallId, @RequestParam int noOfSeats){
        try {
            for (int i = 0 ; i < noOfSeats ; i++){
                Seat seat = new SeatImpl();
                seat.setName("");
                seat.setHallId(hallId);
                seat.setSeatTypeId(1);
                seatManager.persist(seat);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

}
