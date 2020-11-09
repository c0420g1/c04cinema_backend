package com.example.demo.c04cinema.c04cinema.c04cinema.hall;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.generated.GeneratedHallController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HallController extends GeneratedHallController {
    private static final Log log = LogFactory.getLog(HallController.class);
    @Autowired
    private HallManager hallManager;

    @GetMapping("/hall/list")
    public List<Hall> getHallByTheatreId(@RequestParam int page, @RequestParam int theatreId, @RequestParam int pageSize){
        List<Hall> hallList;
        try {
            hallList= hallManager.stream().filter(Hall.THEATRE_ID.equal(theatreId)).skip((page-1)*pageSize).limit(pageSize).collect(Collectors.toList());
            return hallList;
        }catch (Exception e){
            log.error("Lỗi tại vị trí hallController" + e.getMessage());
            return hallList = null;
        }
    }

    @GetMapping("/hall/search")
    public List<Hall> getHallByTheatreIdAndSearch(@RequestParam int page, @RequestParam int theatreId, @RequestParam String hallTitle, @RequestParam int pageSize){
       List<Hall> hallList;
       try {
           hallList = hallManager.stream().filter(Hall.THEATRE_ID.equal(theatreId)).skip((page - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
           return hallList.stream().filter(e -> e.getName().get().toLowerCase().contains(hallTitle.toLowerCase())
                   || e.getName().get().contains(hallTitle))
                   .collect(Collectors.toList());
       } catch (Exception e){
           log.error("Lỗi tại vị trí hallController" + e.getMessage());
           return hallList = null;
       }
    }

}
