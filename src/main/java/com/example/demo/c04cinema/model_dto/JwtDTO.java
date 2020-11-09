package com.example.demo.c04cinema.model_dto;

public class JwtDTO {
    private String accessToken;
    private String username;
    private String authorities;
    private int accountId;
    private String imageUrl;

    public JwtDTO(String accessToken, String username, String authorities, int accountId, String imageUrl) {
        this.accessToken = accessToken;
        this.username = username;
        this.authorities = authorities;
        this.accountId = accountId;
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}
