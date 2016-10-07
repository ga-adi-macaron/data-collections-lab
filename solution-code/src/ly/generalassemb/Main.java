package ly.generalassemb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Test your methods in main
    public static void main(String[] args) {
        // #1
        System.out.println("=== Tests for stringLengthOrValue ===");
        stringLengthOrValue("longer string"); //Should print the string
        stringLengthOrValue("hi"); //Should print 2, the string length
        stringLengthOrValue("five5"); //Should print nothing since the length is exactly 5

        // #2
        System.out.println("\n=== Test for reversedOrder ===");
        reversedOrder(); // Should print the array [0...9] in reverse order

        // #3
        System.out.println("\n=== Tests for maxValue ===");
        System.out.println(maxValue(new int[]{})); //Should print Integer.MIN_VALUE
        System.out.println(maxValue(new int[]{5})); //Should print 5
        System.out.println(maxValue(new int[]{5,15,-5,-2,3})); //Should print 15

        // #4
        System.out.println("\n=== Tests for sumOfValues ===");
        System.out.println(sumOfValues(new double[]{})); //Should print 0
        System.out.println(sumOfValues(new double[]{1.0})); //Should print 1
        System.out.println(sumOfValues(new double[]{-5.0,-15.0,-10.5})); //Should print -30.5

        // #5
        System.out.println("\n=== Tests for charsToString");
        System.out.println(charsToString(new char[]{})); //Should print an empty string
        System.out.println(charsToString(new char[]{'a'})); //Should print "a"
        System.out.println(charsToString(new char[]{'d','r','e','w'})); //Should print "drew"

        // #6
        System.out.println("\n=== Test for myStringList ===");
        System.out.println(myStringList());

        // #7
        System.out.println("\n=== Tests for reversedStringOrder ===");
        List<String> someStrings = new ArrayList<>();

        System.out.println("\n**Empty list**");
        reversedStringOrder(someStrings); //Should print nothing since the list is empty

        someStrings.add("String 1");
        System.out.println("\n**One Item**");
        reversedStringOrder(someStrings); //Should print one string since it is the only value

        someStrings.add("String 2");
        someStrings.add("String 3");
        System.out.println("\n**Three items**");
        reversedStringOrder(someStrings); //Should print 3 items, reversed

        // #8
        System.out.println("\n=== Tests for printOrAdd ===");

        System.out.println("\n**Empty list**");
        System.out.println(printOrAdd(generateList(0)));

        System.out.println("\n**Initial list of two items**");
        System.out.println(printOrAdd(generateList(2)));

        System.out.println("\n**List with initial size of 10 items**");
        System.out.println(printOrAdd(generateList(10)));

        System.out.println("\n**List with initial size greater than 10**");
        System.out.println(printOrAdd(generateList(15)));

        // #9
        System.out.println("\n=== Tests for findMiddle ===");

        System.out.println("\n**Empty list**");
        System.out.println(findMiddle(new int[]{})); //Should print MAX VALUE

        System.out.println("\n**One item**");
        System.out.println(findMiddle(new int[]{5})); //Should print 5

        System.out.println("\n**Four items**");
        System.out.println(findMiddle(new int[]{1,2,3,4})); //Should print 3



    }

    // #1
    public static void stringLengthOrValue(String str){
        if(str.length() > 5){
            System.out.println(str);
        } else if(str.length() < 5) {
            System.out.println(str.length());
        }
    }

    // #2
    public static void reversedOrder(){
        int[] arr = new int[10];

        // Assign the values in the array using i as the index as well as the actual value.
        // Make the array go up until arr.length instead of exactly 10, that way you can change
        // the size of the array without having to modify any other code.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //Print out the values in REVERSE order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // #3
    public static int maxValue(int[] arr){

        // Although the directions don't specify what should happen if an empty array is passed, you should have
        // some strategy to handle it. I chose to set the initial value to the absolute lowest possible value for
        // an integer.
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // #4
    public static double sumOfValues(double[] arr){

        //initialize the sum to 0
        double sum = 0.0;

        //use a for-each loop to go through each value
        for(double num: arr){
            sum += num;
        }

        return sum;
    }

    // #5
    public static String charsToString(char[] arr){
        //Start with an empty String
        String finalString = "";

        //Add each letter to the string use the concatenation '+' symbol
        for(char c: arr){
            finalString += c;
        }

        return finalString;
    }

    // #6
    public static List myStringList(){
        List<String> myList = new ArrayList<>();

        // Since i is unique for each iteration, you can make each String unique simply by adding it on to
        // any other String.
        for (int i = 0; i < 5; i++) {
            myList.add("uniqueString "+i);
        }

        return myList;
    }

    // #7
    public static void reversedStringOrder(List<String> myStrings){

        //To print in reverse order, start at size-1 and go until 0
        for (int i = myStrings.size()-1; i >= 0; i--) {
            System.out.println(myStrings.get(i));
        }
    }

    // #8
    public static List<String> printOrAdd(List<String> myList){

        if(myList.size() < 10){
            // Until the list size is 10, keep increasing it.
            while(myList.size() < 10){
                myList.add("more strings "+myList.size());
            }
        }

        // return the list whether or not it has been modified
        return myList;
    }


    //Helper method for generating lists for the printOrAdd test cases
    public static List<String> generateList(int size){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("Item "+i);
        }
        return list;
    }

    // #9
    public static int findMiddle(int[] arr){
        //Check the case if the array is of size 0, and come up with a strategy for what to return in this case.
        //I chose to return the maximum int value
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //Find the middle index by dividing its length by 2
        int middleIndex = arr.length/2;
        return arr[middleIndex];
    }
}
