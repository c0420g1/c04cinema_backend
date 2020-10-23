package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController extends GeneratedMovieController {
    @Autowired
    private JoinComponent joinComponent;
    @Autowired
    private MovieManager movieManager;

    @GetMapping("/movie/date/{date}")
    public List<Movie> searchByDate(@PathVariable Date date) {
        LocalDate a= date.toLocalDate().plusDays(1);
       return  movieManager.stream().filter(Movie.START_DATE.equal(Date.valueOf(a))).collect(Collectors.toList());
    }
}
