package com.example.demo.c04cinema.c04cinema.c04cinema.movie;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.MovieRatedAge;
import com.speedment.runtime.core.manager.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.generated.GeneratedMovieController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociate;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociateManager;
import com.example.demo.c04cinema.common.Error;
import com.example.demo.c04cinema.common.Regex;
import com.example.demo.c04cinema.model_dto.MovieDTO;



@RestController
public class MovieController extends GeneratedMovieController {

    @Autowired
    private MovieManager movieManager;

    @Autowired
    private MovieGenreAssociateManager movieGenreAssociateManager;

    Regex regex = new Regex();
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
    // lay ve mot list movie  va co tim kiem
    @GetMapping("/movies")
    public List<Movie> getAllMovies(@RequestParam(defaultValue = "") String search) {
        List<Movie> movies = null;
        if (search.equals("")) {
            try {
                movies = movieManager.stream().filter(e -> e.getName().get().toLowerCase().contains(search.toLowerCase())
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
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return movies;


    }


    //creator Hieu
    @GetMapping("/movie-coming/{pageNum}")
    public List<Movie> getMovieComingPage(@PathVariable int pageNum, @RequestParam Date date) {
        int pageSize = 4;
        LocalDate a = date.toLocalDate().plusDays(1);
        List<Movie> movies = null;
        if (pageNum >= 1) {
            try {
                movies = movieManager.stream().filter(Movie.START_DATE.greaterThan(Date.valueOf(a))).skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return movies;
        }
        return null;
    }
    //creator Hieu get best choice film
    @GetMapping ("/movie/bestchoise")
    public List<Movie> getBestChoiceFilm(){
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().filter(Movie.STAR_RATING.equal(5)).sorted(Movie.ID.reversed()).limit(6).collect(Collectors.toList());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return movieList;
    }

    //creator Hieu resolve page
    @GetMapping("/totalPageComing/{date}")
    public Integer getMovieComing(@PathVariable Date date) {
        LocalDate a = date.toLocalDate().plusDays(1);
        List<Movie> movies = null;
        try {
            movies = movieManager.stream()
                    .filter(Movie.START_DATE.greaterThan(Date.valueOf(a))).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   

        return movies.size();
    }


    //creator Hieu
    @GetMapping("/movie/date/{date}")
    public List<Movie> searchByDate(@PathVariable Date date) {
        LocalDate a = date.toLocalDate().plusDays(1);
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().filter(Movie.START_DATE.equal(Date.valueOf(a))).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error at /movie/date/{date}");
        }
        return movieList;
    }

    // creator Hieu
    @GetMapping("/movie-new")
    public List<Movie> getMovieNews() {
//        String s= "";
//        movieManager.stream().filter(e -> s.toLowerCase().contains(e.getName().get()  || s.toUpperCase().contains(e.getName().get())) )
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().sorted(Movie.ID.reversed()).limit(10).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("error in /movie-new");
        }
        return movieList;
    }

    //creator Hieu
    @GetMapping("/movie/{name}")
    public List<Movie> getByName(@PathVariable String name) {
        List<Movie> movieList = null;
        try {
            movieList = movieManager.stream().filter(
                    e -> e.getName().get().toLowerCase().contains(name.toLowerCase())
            ).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return movieList;
    }

    // creator Vu Le Tuong
    @PatchMapping("/movie/{id}")
    public List<Error> editMovie(@RequestBody MovieDTO movie, @PathVariable int id) {
        List<Error> errors = new ArrayList<>();
        Movie movie1 = movieManager.stream().filter(Movie.ID.equal(id)).findFirst().get();
        //posterUrl
        if (movie.getPosterUrl().length()>300){
            errors.add(new Error("posterUrl", "Poster Url must be less than 301 characters"));
        }
        //name
        if (movie.getName().length() > 100 ){
            errors.add(new Error("name", "Name must be less than 101 characters"));
        }
        //startDate
        if (!regex.regexDateMonthYear(movie.getStartDate().toString())) {
            errors.add(new Error("startDate", "Start Date must be follow format: (yyyy-mm-dd)"));
        }
        if (!regex.regexNumber(movie.getStartDate().toString())){
            errors.add(new Error("startDate", "Start Date must be follow format: (yyyy-mm-dd), not be character"));
        }
        //endDate
        if (!regex.regexDateMonthYear(movie.getEndDate().toString())) {
            errors.add(new Error("endDate", "End Date must be follow format: (yyyy-mm-dd)"));
        }
        if (!regex.regexNumber(movie.getEndDate().toString())){
            errors.add(new Error("endDate", "End Date must be follow format: (yyyy-mm-dd), not be character"));
        }
        //actor
        if (!regex.regexSpecialSign(movie.getActor())){
            errors.add(new Error("actor", "Actor must be not special sign"));
        }
        if (movie.getActor().length() > 45 ){
            errors.add(new Error("actor", "Actor must be less than 46 characters"));
        }
        //director
        if (!regex.regexSpecialSign(movie.getDirector())){
            errors.add(new Error("director", "Director must be not special sign"));
        }
        if (movie.getDirector().length() > 45 ){
            errors.add(new Error("director", "Director must be less than 46 characters"));
        }
        //entertainment
        if (movie.getEntertainment().length() > 45 ){
            errors.add(new Error("entertainment", "Entertainment must be less than 46 characters"));
        }
        //duration
        if (movie.getDuration() < 60 || movie.getDuration() >235 ){
            errors.add(new Error("duration", "Duration must be  from 60 to 235 "));
        }
        if (!regex.regexNumber(movie.getDuration().toString())){
            errors.add(new Error("duration", "Duration (minute) must be number from: 60 to 235 minutes"));
        }
        //is2d
        if (movie.getIs2d()<0 || movie.getIs2d()>1){
            errors.add(new Error("is2d", "Version must be number 0 or 1"));
        }
        if (!regex.regexNumber(movie.getIs2d().toString())){
            errors.add(new Error("is2d", "Version must be number 0 or 1"));
        }
        //isSub
        if (movie.getIsSub()<0 || movie.getIsSub()>1){
            errors.add(new Error("isSub", "Subtitle must be number 0 or 1"));
        }
        if (!regex.regexNumber(movie.getIsSub().toString())){
            errors.add(new Error("isSub", "Subtitle must be number 0 or 1"));
        }
        //trailerUrl
        if (movie.getTrailerUrl().length()>250){
            errors.add(new Error("trailerUrl","Trailer Url must be less than 251 characters"));
        }
        if (!regex.regexTrailerUrl(movie.getTrailerUrl())){
            errors.add(new Error("trailerUrl", "Trailer Url must be link starts with: https://www.youtube.com"));
        }
        //movieRatedAgeId
        if (movie.getMovieRatedAgeId()<1 || movie.getMovieRatedAgeId()>5){
            errors.add(new Error("movieRatedAgeId","Movie Rated Age must be number from: 1 to 5"));
        }
        //starRating
        if (movie.getStarRating()<1 || movie.getStarRating()>5){
            errors.add(new Error("starRation","Star Rating must be number from: 1 to 5"));
        }
        //description
        if (movie.getDescription().length() > 1000){
            errors.add(new Error("description", "Description is less than 1000 characters"));
        }
        movie1.setPosterUrl(movie.getPosterUrl());
        movie1.setName(movie.getName());
        movie1.setStartDate(movie.getStartDate());
        movie1.setEndDate(movie.getEndDate());
        movie1.setActor(movie.getActor());
        movie1.setDirector(movie.getDirector());
        movie1.setEntertainment(movie.getEntertainment());
        movie1.setDuration(movie.getDuration());
        movie1.setIs2d(movie.getIs2d());
        movie1.setIsSub(movie.getIsSub());
        movie1.setTrailerUrl(movie.getTrailerUrl());
        movie1.setMovieRatedAgeId(movie.getMovieRatedAgeId());
        movie1.setStarRating(movie.getStarRating());
        movie1.setDescription(movie.getDescription());
        if (errors.isEmpty()){
            movieManager.update(movie1);
        }
        return errors;
    }
//     creator Vu Le Tuong
    @PostMapping("/movie")
    public List<Error> addMovie(MovieDTO movie){

        List<Error> errors = new ArrayList<>();
        //posterUrl
        if (movie.getPosterUrl().length()>300){
            errors.add(new Error("posterUrl", "Poster Url must be less than 301 characters"));
        }
        //name
        if (movie.getName().length() > 100 ){
            errors.add(new Error("name", "Name must be less than 101 characters"));
        }
        //startDate
        if (!regex.regexDateMonthYear(movie.getStartDate().toString())) {
            errors.add(new Error("startDate", "Start Date must be follow format: (yyyy-mm-dd)"));
        }
        if (!regex.regexNumber(movie.getStartDate().toString())){
            errors.add(new Error("startDate", "Start Date must be follow format: (yyyy-mm-dd), not be character"));
        }
        //endDate
        if (!regex.regexDateMonthYear(movie.getEndDate().toString())) {
            errors.add(new Error("endDate", "End Date must be follow format: (yyyy-mm-dd)"));
        }
        if (!regex.regexNumber(movie.getEndDate().toString())){
            errors.add(new Error("endDate", "End Date must be follow format: (yyyy-mm-dd), not be character"));
        }
        //actor
        if (!regex.regexSpecialSign(movie.getActor())){
            errors.add(new Error("actor", "Actor must be not special sign"));
        }
        if (movie.getActor().length() > 45 ){
            errors.add(new Error("actor", "Actor must be less than 46 characters"));
        }
        //director
        if (!regex.regexSpecialSign(movie.getDirector())){
            errors.add(new Error("director", "Director must be not special sign"));
        }
        if (movie.getDirector().length() > 45 ){
            errors.add(new Error("director", "Director must be less than 46 characters"));
        }
        //entertainment
        if (movie.getEntertainment().length() > 45 ){
            errors.add(new Error("entertainment", "Entertainment must be less than 46 characters"));
        }
        //duration
        if (movie.getDuration() < 60 || movie.getDuration() >235 ){
            errors.add(new Error("duration", "Duration must be  from 60 to 235 "));
        }
        if (!regex.regexNumber(movie.getDuration().toString())){
            errors.add(new Error("duration", "Duration (minute) must be number from: 60 to 235 minutes"));
        }
        //is2d
        if (movie.getIs2d()<0 || movie.getIs2d()>1){
            errors.add(new Error("is2d", "Version must be number 0 or 1"));
        }
        if (!regex.regexNumber(movie.getIs2d().toString())){
            errors.add(new Error("is2d", "Version must be number 0 or 1"));
        }
        //isSub
        if (movie.getIsSub()<0 || movie.getIsSub()>1){
            errors.add(new Error("isSub", "Subtitle must be number 0 or 1"));
        }
        if (!regex.regexNumber(movie.getIsSub().toString())){
            errors.add(new Error("isSub", "Subtitle must be number 0 or 1"));
        }
        //trailerUrl
        if (movie.getTrailerUrl().length()>250){
            errors.add(new Error("trailerUrl","Trailer Url must be less than 251 characters"));
        }
        if (!regex.regexTrailerUrl(movie.getTrailerUrl())){
            errors.add(new Error("trailerUrl", "Trailer Url must be link starts with: https://www.youtube.com"));
        }
        //movieRatedAgeId
        if (movie.getMovieRatedAgeId()<1 || movie.getMovieRatedAgeId()>5){
            errors.add(new Error("movieRatedAgeId","Movie Rated Age must be number from: 1 to 5"));
        }
        //starRating
        if (movie.getStarRating()<1 || movie.getStarRating()>5){
            errors.add(new Error("starRation","Star Rating must be number from: 1 to 5"));
        }
        //description
        if (movie.getDescription().length() > 1000){
            errors.add(new Error("description", "Description is less than 1000 characters"));
        }

        Movie movie1 = new MovieImpl();

        movie1.setPosterUrl(movie.getPosterUrl());
        movie1.setName(movie.getName());
        movie1.setStartDate(movie.getStartDate());
        movie1.setEndDate(movie.getEndDate());
        movie1.setDirector(movie.getDirector());
        movie1.setEntertainment(movie.getEntertainment());
        movie1.setDuration(movie.getDuration());
        movie1.setIs2d(movie.getIs2d());
        movie1.setIsSub(movie.getIsSub());
        movie1.setTrailerUrl(movie.getTrailerUrl());
        movie1.setMovieRatedAgeId(movie.getMovieRatedAgeId());
        movie1.setStarRating(movie.getStarRating());
        movie1.setDescription(movie.getDescription());

        
        if (errors.isEmpty()){
            movieManager.persist(movie1);
        }
        return errors;
    };
}
