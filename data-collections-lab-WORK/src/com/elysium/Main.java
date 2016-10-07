package com.elysium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


import static sun.swing.MenuItemLayoutHelper.max;

public class Main {

    public static void main(String[] args) {

        /** 1 - Write a function stringLengthOrValue that accepts one String parameter.
         This function should print the value of the String parameter to the command line if
         the length of the String is greater than 5. If the length of the String is less than
         5, print the length of the String parameter. */

        stringLengthOrValue("hello again");
        stringLengthOrValue("wow");
        reverseOrder();
        maxValue();
        max();
        sumOfValues();

    }

    public static void stringLengthOrValue(String parameter) {

        if (parameter.length() > 5) {
            System.out.println(parameter);

        } else {
            System.out.println(parameter.length());

        }
    }

    /**
     * 2 - Write a function reversedOrder that accepts no parameters. This function should
     * create an int array of size 10 and assign values 0-9 to each index in the array
     * by using a for loop. It should then print out the values in reverse order using
     * a separate for loop inside the function.
     */


    public static void reverseOrder() {

        int[] something = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int x = 0; x < something.length; x++) {

            System.out.println("Value is " + x);
        } //need to figure out how to reverse the numbers
    }

    /**
     * 3 -Write a function maxValue that accepts one int array parameter. This function should loop through
     * the array to return the max value in that array. If the array is of size 1, the max value is the only
     * item in the array. If the array is of size 10, how do we keep a record of the current max value when looping
     * through the array?
     */

    public static void maxValue() {

        int[] maxValue = new int[]{7, 12, 99, 500, 20, 1, 3, 501, 40, 10};
        int higestNumber = Integer.MIN_VALUE;

        for (int x = 0; x < maxValue.length; x++) {
            if (maxValue[x] > higestNumber) {
                higestNumber = maxValue[x];
                System.out.println(maxValue[x]); // can's seem to get the code to sort for the single highest number
            }
        }
    }


    /**
     * 4 - Write a function sumOfValues that accepts a double array parameter. This function should
     * loop through the array and ADD all the values in the array. It should then return the sum of the
     * values, and print the returned value from within the calling function.
     */

    public static void sumOfValues() {

        int[] sumOfValues = new int[]{1, 4, 6, 2};
        int sum = IntStream.of(sumOfValues).sum();
        for (int i = 0; i < sumOfValues.length; i++) {
            System.out.println("Sum of array is " + sum);
        }
    }

    /**
     * Write a function charsToString that takes in a char array parameter. This function should loop
     * through the array and concatenate each char value into a String. It should then return
     * the String that was created, and print the String from within the calling function.
     */

    public static void charsToString(char[] args) {

        int[] charsToString = new int[]{1, 2, 3};


    }

    /**Create a List of type String with the variable name myStringList. Add at least 5 unique
    *String values to the list, and return it. Then print the values in the List from the calling
    *function. (Think about how to generate these strings using a loop)*/

    public static void myStringList(List<String> jayList) {

        jayList = new ArrayList<String>();

        jayList.add("Java");
        jayList.add("is");
        jayList.add("tough");

        myStringList.add(jayList)

    }



}