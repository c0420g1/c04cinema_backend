package com.example.demo.c04cinema.model_dto;

public class SeatDTO {
    private int id;
    private int bonus_seat_point;
    private String name;
    private double price;
    private String color;
    private boolean isAvailable;

    public SeatDTO(int id, int bonus_seat_point, String name, double price, String color, boolean isAvailable) {
        this.id = id;
        this.bonus_seat_point = bonus_seat_point;
        this.name = name;
        this.price = price;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBonus_seat_point() {
        return bonus_seat_point;
    }

    public void setBonus_seat_point(int bonus_seat_point) {
        this.bonus_seat_point = bonus_seat_point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
