package com.example.demo.c04cinema.c04cinema.c04cinema.seat;

import com.example.demo.c04cinema.c04cinema.c04cinema.seat.generated.GeneratedSeatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SeatController extends GeneratedSeatController {
    @Autowired
    SeatManager seatManager;
    @GetMapping("/seatHall/{hallId}")
    public List<Seat> searchByHallId(@PathVariable int hallId){
        return seatManager.stream().filter(Seat.HALL_ID.equal(hallId)).collect(Collectors.toList());
    }

}
