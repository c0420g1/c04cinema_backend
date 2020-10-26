package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController extends GeneratedMovieController {
    @Autowired
    private MovieManager movieManager;



    //creator Hieu
    @GetMapping("/movie/date/{date}")
    public List<Movie> searchByDate(@PathVariable Date date) {
        LocalDate a = date.toLocalDate().plusDays(1);
        List<Movie> movieList = null;
        try {
             movieList = movieManager.stream().filter(Movie.START_DATE.equal(Date.valueOf(a))).collect(Collectors.toList());
        }catch (Exception e){
            System.out.println("Error at /movie/date/{date}");
            return null;
        }
        return  movieList;
    }

    // creator Hieu
    @GetMapping("/movie-new")
    public List<Movie> getMovieNews() {
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().sorted(Movie.ID.reversed()).limit(16).collect(Collectors.toList());
        }catch (Exception e) {
            System.out.println("error in /movie-new");
            return null;
        }
        return movieList;
    }
}
