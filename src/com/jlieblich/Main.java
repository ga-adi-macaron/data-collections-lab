package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //test stringLengthOrValue
        stringLengthOrValue("This");
        stringLengthOrValue("How about this one?");
        stringLengthOrValue("This?");
        //test reversedOrder
        reversedOrder();
        //test maxValue
        int[] x = {1, 3, 5, 1, 2, 9, 1, 100};
        int[] y = {1};
        int[] z = new int[0];
        System.out.println(maxValue(x));
        System.out.println(maxValue(y));
        System.out.println(maxValue(z));
        //test sumOfValues
        double[] toSum = {1.0, 2.0, 3.0, 4.0};
        System.out.println(sumOfValues(toSum));
        //test charToString
        char[] notString = {'t', 'e', 's', 't'};
        char[] isEmpty = new char[0];
        System.out.println(charToString(notString));
        System.out.println(charToString(isEmpty));
        //test myStringList
        for(int i=0;i<myStringList().size();i++) {
            System.out.println(myStringList().get(i));
        }
        //test reversedStringOrder
        reversedStringOrder(myStringList());
        //test printOrAdd
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for(int i=0;i<9;i++) {
            list1.add("Test1-9");
        }
        for(int i=0;i<10;i++) {
            list2.add("Test1-10");
        }
        for(int i=0;i<11;i++) {
            list3.add("Test1-11");
        }
        System.out.println(printOrAdd(list1));
        System.out.println(printOrAdd(list2));
        System.out.println(printOrAdd(list3));
        //test findMiddle
        int[] testLast = {1, 2, 3, 4};
        int[] testLastAgain = {1, 2, 3, 4, 5};
        System.out.println(findMiddle(testLast));
        System.out.println(findMiddle(testLastAgain));
    }

    public static void stringLengthOrValue(String s) {
        if(s.length() < 5) {
            System.out.println(s.length());
        } else if(s.length() > 5) {
            System.out.println(s);
        } else {
            System.out.println("String length cannot be 5");
        }
    }

    public static void reversedOrder() {
        int[] x = new int[10];
        for(int i=0;i<10;i++) {
            x[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(x[9-i]);
        }
    }

    public static int maxValue(int[] x) {
        if(x.length == 0) {
            return 0;
        }
        int max = -1000000;
        for(int i=0;i<x.length;i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static double sumOfValues(double[] arr) {
        double sum = 0;
        for(int i=0; i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static String charToString(char[] ch) {
        String s = "";
        for(int i=0;i<ch.length;i++) {
            s += ch[i];
        }
        return s;
    }

    public static ArrayList<String> myStringList() {
        ArrayList<String> count = new ArrayList<>();
        count.add("one");
        count.add("two");
        count.add("three");
        count.add("four");
        count.add("five");
        return count;
    }

    public static void reversedStringOrder(List<String> list) {
        System.out.println("List in reverse order:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size()-i-1));
        }
    }

    public static ArrayList<String> printOrAdd(ArrayList<String> list) {
        Scanner s = new Scanner(System.in);
        if(list.size() == 10) {
            return list;
        }  else if(list.size() > 10){
            System.out.println("Too many Strings. Resizing list...");
            int count = list.size();
            while(count > 10) {
                list.remove(list.size()-1);
                count--;
            }
            return list;
        } else {
            System.out.println("Add more Strings");
            for(int i=list.size();i<10;i++) {
                list.add(s.nextLine());
            }
            return list;
        }
    }

    public static int findMiddle(int[] arr) {
        if(arr.length%2 == 0) {
            //returns -1 if there is no middle index
            System.out.println("Array cannot have a middle index with an even number of elements");
            return -1;
        } else {
            return arr[(arr.length)/2];
        }
    }
}
