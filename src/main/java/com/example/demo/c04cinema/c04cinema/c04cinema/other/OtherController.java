package com.example.demo.c04cinema.c04cinema.c04cinema.other;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.other.generated.GeneratedOtherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OtherController extends GeneratedOtherController {
    @Autowired
    private OtherManager otherManager;

    // creator Vu Le Tuong
    // lay ve mot list news co phan trang, va co tim kiem
    @GetMapping("/news2/{pageNum}")
    public List<Other> getAllNews(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search) {
        int pageSize = 10;
        List<Other> others = null;
        if (search.equals("")) {
            try {
                others = otherManager.stream().skip((pageNum - 1) * pageSize).limit(pageSize).filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                        || e.getDescription().get().toLowerCase().contains(search.toLowerCase()))
                        .collect(Collectors.toList());
            } catch (Exception e) {
                System.out.println(e);
            }
            return others;
        }

        try {
            others = otherManager.stream().filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                    || e.getDescription().get().toLowerCase().contains(search.toLowerCase()))
                    .skip((pageNum - 1) * pageSize).limit(pageSize).
                            collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return others;

    }


    // creator Vu Le Tuong
    // lay ve mot list news  va co tim kiem
    @GetMapping("/news2")
    public List<Other> getAllNews(@RequestParam(defaultValue = "") String search) {
        List<Other> others = null;
        if (search.equals("")) {
            try {
                others = otherManager.stream().filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                        || e.getDescription().get().toLowerCase().contains(search.toLowerCase())
                        || e.getType().get().toLowerCase().contains(search.toLowerCase())).collect(Collectors.toList());
            } catch (Exception e) {
                System.out.println(e);
            }
            return others;
        }

        try {
            others = otherManager.stream().filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                    || e.getDescription().get().toLowerCase().contains(search.toLowerCase())
                    || e.getType().get().toLowerCase().contains(search.toLowerCase())).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return others;


    }
    @GetMapping("/news")
    public List<Other> getAllNew(){
        List<Other> others = null;
        try {
            others = otherManager.stream().filter(Other.TYPE.equal("news")).collect(Collectors.toList());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return others;
    }

    @GetMapping("/sitemap")
    public List<Other> getAllMenu(){
        List<Other> others = null;
        try {
            others = otherManager.stream().filter(Other.TYPE.equal("sitemap")).collect(Collectors.toList());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return others;
    }
}
