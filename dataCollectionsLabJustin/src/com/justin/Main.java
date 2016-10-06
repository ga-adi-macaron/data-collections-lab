package com.justin;
import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        stringLengthOrValue("bananana");
        stringLengthOrValue("fox");
        reversedOrder();
        int [] nums = {1,5,32,15,19,6,28};
        System.out.println(maxValue(nums));
        double [] toBeAdded = {4,16,2.2};
        System.out.println(sumOfValues(toBeAdded));
        char [] letters = {'H','e','l','l','o'};
        String test = charsToString(letters);
        reversedStringOrder(printOrAdd(stringList()));
        int x = findMiddle(nums);
    }

    //1
    public static void stringLengthOrValue (String word){
        if (word.length() > 5 ) {
            System.out.println(word);
        }

        else {
            System.out.println(word.length());
        }

    }

    //2
    public static void reversedOrder () {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        for (int i = (numbers.length - 1); i >= 0; i--) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }

    //3
    public static int maxValue (int [] array) {
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array [i];
            }
        }

        return max;
    }

    //4
    public static double sumOfValues (double [] numbas) {
        double sum = 0;
        for (int i = 0; i < numbas.length; i++) {
            sum += numbas[i];
        }

        System.out.println(sum);
        return sum;
    }

    //5
    public static String charsToString (char [] letters) {
        String word = new String(letters);
        System.out.println(word);
        return word;

    }

    //6
    public static List<String> stringList (){

        String temp;
        List<String> strings = new ArrayList<>();

        do {
            System.out.print("\nEnter words, type 'quit' to quit: ");
            temp = input.nextLine();

            if(!temp.equals("quit")) {
                strings.add(temp);
            }

        }while(!temp.equals("quit"));

        System.out.println("\n" + strings);

        return strings;
    }

    //7
    public static void reversedStringOrder (List<String> words) {

        for (int i = (words.size()-1); i >= 0 ; i--) {
            System.out.println(words.get(i));
        }

    }

    //8
    public static List<String> printOrAdd (List<String> words) {
        String [] defaultWords= {"bananana", "aardvark", "texas", "whiskey", "alpha",
                                    "berserker", "honey", "trident", "aleppo", "muskrat"};

        if (words.size() < 10) {
            for (int i = words.size(); i < 10; i++) {
                words.add(defaultWords[i]);
            }
        }

        System.out.println(words);
        return words;

    }

    //9
    public static int findMiddle (int [] numbers) {
        int mid =0;
        if ((numbers.length%2)!=0) {
            mid = numbers[(numbers.length-1)/2];
            System.out.println(mid);
        }

        else {
            System.out.println("theres not really a middle");
        }

        return mid;
    }
}
