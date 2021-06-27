package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
public static String pluralize (String name,int count){
    if (count==1){
        return name;
    }else{
        return name+"s";
    }
}
    public static void main(String[] args) {
	// write your code here

        int dogCount = 10;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipHeads(5);
                clock();

    }


    public static void clock(){
    while (true){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
// or, if you're feeling fancy
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (second==LocalDateTime.now().getSecond()){
            continue;
        }
        System.out.println(time);
    }}
    public static void flipHeads (int n){
    int heads =0 ;
    int tails = 0;
    double flips ;
        Random randomNum = new Random();
        while (n !=heads){
            flips = randomNum.nextDouble();
            if (flips >= 0.5){
                System.out.println("heads");
                heads =heads+1;
                tails = tails+1;
            }else {System.out.println("tails");
            tails= tails+1;
            heads=0;
            }
        }
System.out.println("It took " + tails + " flips to flip "+ n + " heads in a row");
    }
}
