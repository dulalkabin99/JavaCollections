package com.company;
import java.util.ArrayList;

public class MovieList {

    private String name;
    private  int year;
    // private ArrayList<Movie> movies


    public MovieList(String name, int year){
        this.name =name;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie name:  " + name + "||   Movie year: " + year +"\n" ;
    }
}


