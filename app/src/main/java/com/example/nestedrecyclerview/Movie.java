package com.example.nestedrecyclerview;

public class Movie {

    String id;
    String name;
    String poster;
    String genre;


    public Movie(String id, String name, String poster, String genre) {
        this.id = id;
        this.name = name;
        this.poster = poster;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPoster() {
        return poster;
    }


    public String getGenre() {
        return genre;
    }
}
