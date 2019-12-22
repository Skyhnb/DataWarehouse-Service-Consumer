package com.example.serverconsumer.entity.QueryEntity;

public class UserWithGenre {
    private String genre;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}