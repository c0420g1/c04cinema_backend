package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;
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

    // creator Vu Le Tuong
    // lay ve movie cuoi cung (tuc movie moi them vao), de lay ra truong movie id, add vao bang movie_genre_associate,
    // la bang quan he nhieu nhieu giua bang movie va bang movie_genre_type
    @GetMapping("/lastMovie")
    public Movie getLastMovie() {
        Movie movie = null;
        try {
            movie = movieManager.stream().sorted(Movie.ID.reversed()).findFirst().get();
        } catch (Exception e) {
            System.out.println(e);
        }
        return movie;
    }

    // creator Vu Le Tuong
    // lay ve tat ca cac record cua bang movie_genre_associate
    @GetMapping("/getAllMovieGenreAssociate/{movieid}")
    public List<MovieGenreAssociate> getAllMovieGenreAssociate(@PathVariable int movieid) {
        List<MovieGenreAssociate> movieGenreAssociates = null;
        try {
            movieGenreAssociates = movieGenreAssociateManager.stream().filter(MovieGenreAssociate.MOVIE_ID.equal(movieid)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return movieGenreAssociates;
    }


    // creator Vu Le Tuong
    // xoa tat ca record trong bang quan he nhieu-nhieu: movie_genre_associate, dung trong chuc nang edit-movie (chuc nang nay
    //    co chuc nang sua the loai phim
    @DeleteMapping("/movieGenreAssociate/{movieId}")
    public void deleteMovieGenreAssociateByMovieId(@PathVariable int movieId) {
        try {
            movieGenreAssociateManager.stream().filter(MovieGenreAssociate.MOVIE_ID.equal(movieId)).forEach(e ->
                    movieGenreAssociateManager.remove(e));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // creator Vu Le Tuong
    // lay ve mot list movie co phan trang, va co tim kiem
    @GetMapping("/movies/{pageNum}")
    public List<Movie> getAllMovies(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search) {
        int pageSize = 10;
        List<Movie> movies = null;
        if (search.equals("")) {
            try {
                movies = movieManager.stream().skip((pageNum - 1) * pageSize).limit(pageSize).filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                        || e.getEntertainment().get().contains(search) || String.valueOf(e.getStartDate().get()).contains(search)
                        || String.valueOf(e.getDuration()).contains(search))
                        .collect(Collectors.toList());
            } catch (Exception e) {
                System.out.println(e);
            }
            return movies;
        }

        try {
            movies = movieManager.stream().filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
                    || e.getEntertainment().get().contains(search) || String.valueOf(e.getStartDate().get()).contains(search)
                    || String.valueOf(e.getDuration()).contains(search) || String.valueOf(e.getIs2d()).contains(search))
                    .skip((pageNum - 1) * pageSize).limit(pageSize).
                            collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return movies;


    }

    // creator Vu Le Tuong
    // lay ve mot list movie, co tim kiem, nhung khong co phan trang

    
//    @GetMapping("/movies")
//    public List<Movie> getListMovie(@RequestParam(defaultValue = "") String search) {
//
//    }
//


    //creator Hieu
    @GetMapping("/movie/date/{date}")
    public List<Movie> searchByDate (@PathVariable Date date){
        LocalDate a = date.toLocalDate().plusDays(1);
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().filter(Movie.START_DATE.equal(Date.valueOf(a))).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error at /movie/date/{date}");
            return null;
        }
        return movieList;
    }

    // creator Hieu
    @GetMapping("/movie-new")
    public List<Movie> getMovieNews(){
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().sorted(Movie.ID.reversed()).limit(16).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("error in /movie-new");
            return null;
        }
        return movieList;
    }
}