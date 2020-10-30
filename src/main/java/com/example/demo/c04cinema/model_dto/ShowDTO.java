package com.example.demo.c04cinema.model_dto;

public class ShowDTO {
    private int id;
    private String time;
    private double price;

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public ShowDTO(int id, String time, double price) {
        this.id = id;
        this.time = time;
        this.price = price;
    }
}
