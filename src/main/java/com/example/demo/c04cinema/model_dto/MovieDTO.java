package com.example.demo.c04cinema.model_dto;

import java.sql.Date;

public class MovieDTO {
    private int id;
    private String name;
    private String director;
    private String actor;
    private Byte isSub;
    private Byte is2d;
    private String posterUrl;
    private Date startDate;
    private Date endDate;
    private Integer duration;
    private String trailerUrl;
    private Integer starRating;
    private Integer movieRatedAgeId;
    private String description;
    private String entertainment;

    public MovieDTO(String name, String director, String actor, Byte isSub, Byte is2d, String posterUrl, Date startDate,
                    Date endDate, Integer duration, String trailerUrl, Integer starRating, Integer movieRatedAgeId,
                    String description, String entertainment) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.isSub = isSub;
        this.is2d = is2d;
        this.posterUrl = posterUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.trailerUrl = trailerUrl;
        this.starRating = starRating;
        this.movieRatedAgeId = movieRatedAgeId;
        this.description = description;
        this.entertainment = entertainment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Byte getIsSub() {
        return isSub;
    }

    public void setIsSub(Byte isSub) {
        this.isSub = isSub;
    }

    public Byte getIs2d() {
        return is2d;
    }

    public void setIs2d(Byte is2d) {
        this.is2d = is2d;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public Integer getMovieRatedAgeId() {
        return movieRatedAgeId;
    }

    public void setMovieRatedAgeId(Integer movieRatedAgeId) {
        this.movieRatedAgeId = movieRatedAgeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }
}
