package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.Location;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.Theatre;

import java.util.Collections;
import java.util.List;

public class BookingTimeDTO {
    private int theatreId;
    private String theatreName;
    private String hallName;
    private List<ShowDTO> showDTO;

    public int getTheatreId() {
        return theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public String getHallName() {
        return hallName;
    }

    public List<ShowDTO> getShowDTO() {
        return showDTO;
    }

    public BookingTimeDTO(int theatreId, String theatreName, String hallName, List<ShowDTO> showDTO) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.hallName = hallName;
        this.showDTO = showDTO;
    }
}
