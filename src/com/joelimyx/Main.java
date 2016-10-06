package com.joelimyx;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    1) string length or value
    public static void stringLengthOrValue(String phrase){
        if(phrase.length()>5)
            System.out.println("This phrase is: "+ phrase);
        else
            System.out.println("The lenght of the phrase is: "+phrase.length());
    }
//    2) reverseOrder
    public static void reversedOrder(){
        int [] orderList = {0,1,2,3,4,5,6,7,8,9};
        for (int i = orderList.length-1; i >= 0; i--) {
            System.out.println(orderList[i]);
        }
    }
//    3) maxValue
    public static int maxValue(int[] numList){
        int max=0;
        if (numList.length==1)
            return numList[0];
        else if (numList.length==0)
            return max;
        for (int i = 0; i < numList.length; i++) {
            if(numList[i]>max)
                max=numList[i];
        }
        return max;
    }
//    4) sumOfValues
    public static double sumOfValues(double[] numList){
        int sum=0;
        for (int i = 0; i < numList.length; i++) {
            sum+=numList[i];
        }
        return sum;
    }
//    5) charsToString
    public static String charsToString(char[] charList){
        String phrase = "";
        for (int i = 0; i < charList.length; i++) {
            phrase=phrase.concat(charList[i]+" ");
        }
        return phrase;
    }
//    6) addStringToList
    public static ArrayList<String> myStringList(){
        ArrayList<String> phraseList = new ArrayList<>();
        phraseList.add("This");
        phraseList.add("is");
        phraseList.add("going");
        phraseList.add("to");
        phraseList.add("be");
        phraseList.add("Amazing.");
        return phraseList;
    }
//    7) reversedStringOrder
    public static void reversedStringOrder(List<String> phraseList){
        ArrayList<String> tempList = new ArrayList<>();
        for (int i = 0; i < phraseList.size(); i++) {
            tempList.add(phraseList.get(i));
        }
        int j= phraseList.size()-1;
        for (String phrase : tempList) {
            phraseList.set(j,phrase);
            j--;
        }
    }
//    8) printOrAdd
    public static ArrayList<String> printOrAdd(ArrayList<String> phraseList){
        if (phraseList.size()==10)
            for (String phrase :
                    phraseList) {
                System.out.println(phrase);
            }
        else if (phraseList.size()<10){
            while(phraseList.size()<10){
                phraseList.add("more more soul.");
            }
        }else
            System.out.println("The list is too long to print.");

        return phraseList;
    }
//    9) findMiddle
    public static int findMiddle(int[] numList){
        int half = numList.length/2;
        return numList[half];
    }


    public static void main(String[] args) {
	// write your code here
        int [] numList = {6,123,45,2,33,42,1,22};
        char [] charList = {'a','b','f','t','p'};
        double [] doubleList = {6,123,45,2.434,33,12.42,1.22,22};

        System.out.println("\nNumber 1");
        stringLengthOrValue("this");
        stringLengthOrValue("this should work");

        System.out.println("\nNumber 2");
        reversedOrder();

        System.out.println("\nNumber 3");
        System.out.println("The max value is: "+maxValue(numList));

        System.out.println("\nNumber 4");
        System.out.println("The sum is: "+sumOfValues(doubleList));

        System.out.println("\nNumber 5");
        System.out.println("The char in String: "+charsToString(charList));

        System.out.println("\nNumber 6");
        ArrayList<String> phraseList = myStringList();
        for (String phrase :
                phraseList) {
            System.out.println(phrase);
        }

        System.out.println("\nNumber 7");
        reversedStringOrder(phraseList);
        System.out.println("This list is reversed: ");
        for (String phrase :
                phraseList) {
            System.out.println(phrase);
        }

        System.out.println("\nNumber 8");
        ArrayList<String> lengthenList = printOrAdd(phraseList);
        System.out.println("This list is lengthened: ");
        for (String phrase :
                phraseList) {
            System.out.println(phrase);
        }
        System.out.println("\nThis is to try the 10 items: ");
        ArrayList<String> tryList = printOrAdd(lengthenList);

        System.out.println("\n Number 9");
        System.out.println("The middle is: "+findMiddle(numList));

    }
}
