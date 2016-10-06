package com.korbkenny;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1
        stringLengthOrValue("gorilla");
        stringLengthOrValue("soap");
        stringLengthOrValue("books");

        //2
        reversedOrder();


        //3
        int[] anArray = {20, 12, 30, 12, 60, 40};
        maxValue(anArray);

        //4
        double[] numbers = {30.0, 26.4, 800.22};
        sumOfValues(numbers);

        //5
        char[] toString = {'h', 'o', 'w', 'd', 'y'};


        //6
        myStringListCall();

        //7


        //8


        //9



    }

    //1

    public static void stringLengthOrValue(String string1) {
        if (string1.length() > 5) {
            System.out.println(string1);
            return;
        } else if (string1.length() < 5) {
            System.out.println(string1.length());
            return;
        } else {
            System.out.println("What if it's equal to 5, huh?");
        }
    }


     //2

     public static void reversedOrder(){
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
    }


    //3

    public static int[] maxValue(int[] anArray){
        int theMaxOne = anArray[0];
        int theMaxOnePlace;
              for (int i = 0; i < anArray.length; i++) {

                  if(theMaxOne < anArray[i]){
                      theMaxOne = anArray[i];
                  }

        }

        System.out.println("The max is " + theMaxOne);
        return anArray;
    }


    //4
    public static void sumOfValues(double[] numbers){
        double datSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            datSum = datSum + numbers[i];
        }
        System.out.println(datSum);
    }

    //5




    //6
    public static void myStringListCall(){

        List<String> myStringList = new ArrayList<>();
            myStringList.add("jeff");
            myStringList.add("is");
            myStringList.add("a");
            myStringList.add("cool");
            myStringList.add("name");

        for (int i = 0; i < myStringList.size(); i++) {
            System.out.println(myStringList.get(i));
        }

        return;
    }




    }











