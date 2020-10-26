package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.Theatre;

import java.util.Collections;
import java.util.List;

public class BookingTimeDTO {
    private int theatreId;
    private int showId;
    private int hallId;
    private String theatreName;
    private List<String> showTime;

    public int getTheatreId() {
        return theatreId;
    }

    public int getShowId() {
        return showId;
    }

    public int getHallId() {
        return hallId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public List<String> getShowTime() {
        return showTime;
    }

    public BookingTimeDTO(Theatre theatre, Hall hall, Show show) {
        this.theatreId = theatre.getId();
        this.hallId= hall.getId();
        this.showId= show.getId();
        this.theatreName = theatre.getName().get();
        this.showTime = Collections.singletonList(show.getStartTime().get().toString());
    }

}
