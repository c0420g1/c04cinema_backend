package com.example.demo.c04cinema.model_dto;

import java.util.List;

public class CommentDTO {
    private int id;
    private int movieId;
    private int customerId;
    private String customerName;
    private String customerImgUrl;
    private String time;
    private String comment;
    private int sumComment;
    private List<CommentDTO> reply;

    public CommentDTO(int id, int movieId, int customerId, String customerName, String customerImgUrl, String time, String comment, int sumComment, List<CommentDTO> reply) {
        this.id = id;
        this.movieId = movieId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerImgUrl = customerImgUrl;
        this.time = time;
        this.comment = comment;
        this.sumComment = sumComment;
        this.reply = reply;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerImgUrl() {
        return customerImgUrl;
    }

    public void setCustomerImgUrl(String customerImgUrl) {
        this.customerImgUrl = customerImgUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getSumComment() {
        return sumComment;
    }

    public void setSumComment(int sumComment) {
        this.sumComment = sumComment;
    }

    public List<CommentDTO> getReply() {
        return reply;
    }

    public void setReply(List<CommentDTO> reply) {
        this.reply = reply;
    }
}
