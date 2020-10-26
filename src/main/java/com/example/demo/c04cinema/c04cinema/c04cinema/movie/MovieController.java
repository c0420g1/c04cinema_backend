package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociate;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociateManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.speedment.runtime.join.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/movieGenreAssociate/{movieId}")
    public void deleteMovieGenreAssociateByMovieId(@PathVariable int movieId){
       movieGenreAssociateManager.stream().filter(MovieGenreAssociate.MOVIE_ID.equal(movieId)).forEach(e->
             movieGenreAssociateManager.remove(e));
    }
    @GetMapping("/movies/{pageNum}")
    public List<Movie> getAllMovies(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search){
        int pageSize =10;

        if (search.equals("")){
            return movieManager.stream().skip((pageNum-1)*pageSize).limit(pageSize).filter(e-> e.getName().get().toLowerCase().contains(search.toLowerCase())
                    || e.getEntertainment().get().contains(search) || String.valueOf(e.getStartDate().get()).contains(search)
                    || String.valueOf(e.getDuration()).contains( search))
                    .collect(Collectors.toList());
        }
        return movieManager.stream().filter(e-> e.getName().get().toLowerCase().contains(search.toLowerCase())
                || e.getEntertainment().get().contains(search) || String.valueOf(e.getStartDate().get()).contains(search)
                || String.valueOf(e.getDuration()).contains( search)).skip((pageNum-1)*pageSize).limit(pageSize).
                collect(Collectors.toList());
    }

    @GetMapping("/movies")
    public List<Movie> getListMovie(@RequestParam(defaultValue = "") String search){


        return movieManager.stream().filter(e-> e.getName().get().toLowerCase().contains(search.toLowerCase())
                || e.getEntertainment().get().contains(search) || String.valueOf(e.getStartDate().get()).contains(search)
                || String.valueOf(e.getDuration()).contains( search)).collect(Collectors.toList());
    }
}
