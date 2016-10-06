package NikitaS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ////Test for first
//        stringLengthOrValue("Nikita");
//        stringLengthOrValue("Nick");
//        stringLengthOrValue("Fifth");

//        //Test for second
//        reversedOrder();

    }

    //1. First function of lab---------------------------
    public static void stringLengthOrValue(String word){
        int lenWord = word.length();
        if (lenWord>5){
            System.out.println(word);
        }else if (lenWord<5){
            System.out.println(lenWord);
        }else if (lenWord == 5){
            System.out.println("Undeclared result");
        }
    }

    //2. Second function of lab-----------------------
    public static void reversedOrder(){
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= i;
        }
        for (int i = nums.length-1; i >=0; i--) {
            System.out.println(nums[i]);
        }
    }

    //3. Third function of lab---------------------------
    public static int maxValue(int[] numArr){
        if (numArr.length == 1){
            return numArr[0];
        }else if (numArr.length == 0){
            return -1;
        }else {
            int maxVal = 0;
            for (int i: numArr){
                if (i>maxVal){
                    maxVal = i;
                }
            }
            return maxVal;
        }
    }
    //4. Fourth function of lab----------------------
    public static double sumOfValues(double[] dubArr){
        int sum = 0;
        for (double d: dubArr){
            sum+=d;
        }
        System.out.println(sum);
        return sum;
    }

    //5. Fifth function of lab-----------------------
    public static String charsToString(char[] chars){
        String word = "";
        for (char c: chars){
            word += String.valueOf(c);
        }
        System.out.println(word);
        return word;
    }


    //6. Sixth function of lab--------------------------
    public static List<String> createStringList(String... strings){
        ArrayList<String> myStringList = new ArrayList<>();
        for (String string:strings){
            myStringList.add(string);
        }
        System.out.println(myStringList);
        return myStringList;
    }

    //7. Seventh function of lab--------------------------
    public static void reversedStringOrder(ArrayList<String> stringArrayList){
        for (int i = stringArrayList.size(); i>0 ; i--) {
            System.out.println(stringArrayList.get(i));
        }

    }

    //8. Eighth function of lab----------------------------
    public static List<String> printOrAdd(ArrayList<String> stringList){
        int sizeOfList = stringList.size();
        if (sizeOfList<10){
            while (sizeOfList<10){
                stringList.add("Filler Word");
            }
        }else if (sizeOfList>10){
            System.out.println("Size of list is too large.");
            return stringList;
        }
        return stringList;

    }


    //9. Ninth function of lab--------------------------------
    public static int findMiddle(int[] intArr){
        int midPoint = intArr.length/2;
        if (intArr.length%2 == 0){
            String twoNumbs = String.valueOf(intArr[midPoint-1])+String.valueOf(intArr[midPoint]);
            System.out.println("Since the number is of even length. These are the two numbers in the middle:" + twoNumbs);
            return Integer.parseInt(twoNumbs);
        }else{
            System.out.println(intArr[midPoint-1]);
            return intArr[midPoint-1];
        }

    }






}