package com.company;

public class Main {

    public static void printAmerican (String day, String month, int date, int year){
        System.out.printf("American format: %s, %s %d, %d", day, month, date, year);
    }

    public static void printEuropean (String day, String month, int date, int year){
        System.out.printf("European format: %s, %d %s, %d", day, date, month, year);
    }

    public static void main(String[] args) {
	    String day = "Monday";
        String month = "February";
        int date = 25;
        int year = 2021;
        printAmerican(day, month, date, year);
        System.out.println();
        printEuropean(day, month, date, year);


    }
}
