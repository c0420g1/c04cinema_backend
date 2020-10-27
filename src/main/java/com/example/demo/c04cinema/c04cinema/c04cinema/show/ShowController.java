package com.example.demo.c04cinema.c04cinema.c04cinema.show;

import com.example.demo.c04cinema.c04cinema.c04cinema.show.generated.GeneratedShowController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ShowController extends GeneratedShowController {

    @Autowired
    private ShowManager showManager;
    @GetMapping("/shows")
    public List<Show> getList(){
        List<Show> showList = null;
        try {
            showList = showManager.stream().collect(Collectors.toList());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return showList;
    }
}
