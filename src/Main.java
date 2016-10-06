import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scott Lindley on 10/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("**********\nPROBLEM 1 TEST\n**********");
        stringLengthOrValue("Hi");
        stringLengthOrValue("hello, there!");
        stringLengthOrValue("");
        stringLengthOrValue(null);

        System.out.println("**********\nPROBLEM 2 TEST\n**********");
        reverseOrder();

        System.out.println("**********\nPROBLEM 3 TEST\n**********");
        int[] array = new int[]{34, 23, 4, 23, 76, 3, 23, 76, 45, 78, 43};
        System.out.println("The max value is " + maxValue(array));

        System.out.println("**********\nPROBLEM 4 TEST\n**********");
        double[] doubArray = new double[]{34.5,23.678,32,12.6,2.402};
        System.out.println("The sum is "+sumOfValues(doubArray));

        System.out.println("**********\nPROBLEM 5 TEST\n**********");
        char[] charArray = new char[]{'S','c','o','t','t'};
        char[] emptyCharArray = new char[0];
        System.out.println("empty char array string is "+charsToString(emptyCharArray));
        System.out.println("The assembled string is "+charsToString(charArray));

        System.out.println("**********\nPROBLEM 6 TEST\n**********");
        System.out.println(returnStringList());

        System.out.println("**********\nPROBLEM 7 TEST\n**********");
        reversedStringOder(returnStringList());

        System.out.println("**********\nPROBLEM 8 TEST\n**********");
        ArrayList<String> emptyArray = new ArrayList<>();
        System.out.println(printOrAdd(emptyArray));
        System.out.println(printOrAdd(returnStringList()));

        System.out.println("**********\nPROBLEM 9 TEST\n**********");
        System.out.println(findMiddle(array));
    }

    public static void stringLengthOrValue(String str) {
        try {
            if (str.length() > 5) {
                System.out.println(str);
            } else {
                System.out.println(str.length());
            }
        } catch (NullPointerException npe) {
            System.out.println("not a valid string");
        }
    }

    public static void reverseOrder() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static double sumOfValues(double[] doubArray){
        double sum = 0;
        for (int i=0; i<doubArray.length; i++){
            sum+=doubArray[i];
        }
        return sum;
    }

    public static String charsToString (char[] chars){
        String result = "";
        for(int i=0; i<chars.length; i++){
            result+=Character.toString(chars[i]);
        }
        return result;
    }

    public static ArrayList<String> returnStringList (){
        ArrayList<String> myStringList = new ArrayList<>();
            for(int i=0; i<5; i++){
                myStringList.add("this cell is "+i);
            }
        return myStringList;
    }

    public static void reversedStringOder(ArrayList<String> strs){
        for(String s: strs){
            StringBuilder rvs = new StringBuilder(s);
            System.out.println(rvs.reverse());
        }
    }

    public static List<String> printOrAdd(List<String> strs){
        if(strs.size()==10){
            for(String s: strs){
                System.out.println(s);
            }
        }else{
            for(int i=strs.size(); i<11; i++){
                strs.add("added cell "+i);
            }
        }
        return strs;
    }

    public static int findMiddle(int[] array){
        return array[array.length/2];
    }
}
