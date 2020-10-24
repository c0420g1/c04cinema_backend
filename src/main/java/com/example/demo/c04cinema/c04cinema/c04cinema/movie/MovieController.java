package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociate;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociateManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController extends GeneratedMovieController {
    @Autowired
    private MovieManager movieManager;
    @Autowired
    private MovieGenreAssociateManager movieGenreAssociateManager;

    @GetMapping("/lastMovie")
    public Movie getLastMovie(){
        return movieManager.stream().sorted(Movie.ID.reversed()).findFirst().get();
    }

    @GetMapping("/getAllMovieGenreAssociate/{movieid}")
    public List<MovieGenreAssociate> getAllMovieGenreAssociate(@PathVariable int movieid){
        return movieGenreAssociateManager.stream().filter(MovieGenreAssociate.MOVIE_ID.equal(movieid)).collect(Collectors.toList());
    }

    @GetMapping("/movie/date/{date}")
    public List<Movie> searchByDate(@PathVariable Date date) {
        LocalDate a= date.toLocalDate().plusDays(1);
       return  movieManager.stream().filter(Movie.START_DATE.equal(Date.valueOf(a))).collect(Collectors.toList());
    }
}
