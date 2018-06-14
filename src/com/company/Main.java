package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String mName="";
        boolean quitBoolean = false;
        int year;
        System.out.println("Welcome to movie recorder:");
        mov mm= new mov();

        while(quitBoolean==false) {
                //!mName.equalsIgnoreCase("q")){
            System.out.println("please Enter your Movie Name: ");
            mName=sc.next();
            System.out.println("Please enter Movie year:");
            year=sc.nextInt();

            MovieList thisList=new MovieList(mName, year);

            mm.addMovie(thisList);

            System.out.println("Enter Q to quit or any else to continue:");
            //System.out.println("Another movie, enter Q to quit or movie name to continue?");
            String quitInput=sc.next();

            if (quitInput.equalsIgnoreCase("q")) {
                quitBoolean=true;
            }
        }

        System.out.println(mm);








    }
}
