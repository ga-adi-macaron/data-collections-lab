package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        stringLengthOrValue("Well"); // #1
        stringLengthOrValue("Welcome"); // #1
        reverseOrder(); // #2
        int[] nums = {50, 40, 30, 20, 10}; // #3 & #9
        System.out.println(maxValue(nums)); // #3
        double[] nums1 = {20.2, 62.3, 22.4}; // #4
        System.out.println(sumofValues(nums1)); // #4
        char[] chars = new char[]{'A', 'n', 'd', 'r', 'o', 'i', 'd'}; // #5
        System.out.println(charToString(chars)); // #5
        System.out.println(getMyStrings()); // #6
        reversedStringOrder(getMyStrings()); // #7
        printOrAdd(getMyStrings()); // #8
        System.out.println(findMiddle(nums)); // #9



    }

    // Function #1
    public static void stringLengthOrValue(String str){
        if (str.length() > 5){
            System.out.println(str.length());
        } else {
            System.out.println(str);
        }
    }

    // Function #2
    public static void reverseOrder(){
        int[] nums = new int[10];
        for (int i = 9; i < nums.length; i--) {
            nums[i] = i;
            System.out.println(i);
            if (i == 0){
                break;
            }
        }
    }

    // Function #3
    public static int maxValue(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        } return max;
    }

    // Function #4
    public  static double sumofValues(double[] num){
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        } return sum;
    }

    // Function #5
    public static String charToString (char[] chars){
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += Character.toString(chars[i]);
        } return str;
    }

    // Function #6
    public static List<String> getMyStrings() {
        List<String> myStrings = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            myStrings.add("Testing.. "+i);
        } return myStrings;
    }

    // Function #7
    public static void reversedStringOrder(ArrayList<String> arr){
        for (String str: arr){
            StringBuilder list = new StringBuilder(str);
            System.out.println(list.reverse());
        }
    }

    // Function #8
    public static List<String> printOrAdd(List<String> arr){
        if (arr.size() >= 10) {
            for (String str : arr) {
                System.out.println(str);
            }
        } else {
            for (int i = 0; i < arr.size(); i++) {
                arr.add("Ending.. "+i);
            }
        } return arr;
    }

    // Function #9
    public static int findMiddle(int[] arr){
        return arr[arr.length/2];
    }
}
