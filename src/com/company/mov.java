package com.company;

import java.util.ArrayList;

public class mov {
    ArrayList<MovieList> movieItem;


    public mov (){
        movieItem=new ArrayList<MovieList>();
    }
    public void addMovie(MovieList toAdd){
        this.movieItem.add(toAdd);
    }

    @Override
    public String toString() {
        return " "+movieItem ;
    }
}

