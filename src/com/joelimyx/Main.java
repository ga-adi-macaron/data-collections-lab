package com.joelimyx;

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
    
    public static void main(String[] args) {
	// write your code here
        stringLengthOrValue("this");
        stringLengthOrValue("this should work");

        reversedOrder();;

    }
}
