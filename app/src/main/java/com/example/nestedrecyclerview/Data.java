package com.example.nestedrecyclerview;

import java.util.List;

public class Data {

    List<Movie> list;
    String genre;
    String type;

    public Data(List<Movie> list, String genre, String type) {
        this.list = list;
        this.genre = genre;
        this.type = type;
    }

    public List<Movie> getList() {
        return list;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }
}
