package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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
//                clock();
        roll(4);

        int [] falseArr={66, 64, 58, 65, 71, 57, 60, 65, 65, 70, 72, 65, 51};
        int [] trueArr = {10,20,30,40,50,60};
        System.out.println(containsDuplicates(trueArr));
        System.out.println(containsDuplicates(falseArr));
        System.out.println(avgTesting(trueArr));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(lowestAvg(weeklyMonthTemperatures)));

    }
    public static void roll (int n){


    Random rolling = new Random();

    int randomN;

    ArrayList <Integer> dice = new ArrayList<> ();

    for (int i = 0 ;i < n ; i++ ){
    randomN=rolling.nextInt(7-1)+1;
        dice.add(randomN);

    }
        System.out.println(dice);

    }

    public static boolean containsDuplicates(int [] test1){
    int element;
    for (int i = 0; i < test1.length ;i++ ){
        element = test1[i];
        for (int j = i+1; j < test1.length ;j++ ){
         if (element == test1[j]){
             return false;
         }
        }

    }
    return true;
    }

    public static double avgTesting(int [] avg){
    double sum = 0 ;
    for (int i=0;i < avg.length ; i++){
        sum += avg[i];
    }
    return  sum/avg.length;
    }

    public static void clock(){
    while (true){
        LocalDateTime now = LocalDateTime.now();
        int second = now.getSecond();
// or, if you're feeling fancy
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (second==LocalDateTime.now().getSecond()){
            continue;
        }
        System.out.println(time);
    }}

    public static int[]  lowestAvg (int [] [] arr ){
    double sum=0;
    double avg;
    double minAvg=Integer.MAX_VALUE;
    int [] lowArr =arr[0];
    for (int i = 0 ; i < arr.length ; i++){
        sum =0;
        for (int j = 0 ; j < arr[i].length ; j++){
    sum += arr[i][j];
        }
        avg=sum/arr[i].length;
        if (avg < minAvg){
            minAvg=avg;
            lowArr = arr[i];
        }
    }
    return lowArr;
    }

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
