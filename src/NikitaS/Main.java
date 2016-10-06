package NikitaS;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        ////Test for first *
//        stringLengthOrValue("Nikita");
//        stringLengthOrValue("Nick");
//        stringLengthOrValue("Fifth");

//        //Test for second **
//        reversedOrder();

        ////Setup for third ***
//        int[] test1= new int[1];
//        int[] test2 =new int[0];
//        int[] test3={5,12,7,2,13,16,19,1337,7,20};
//        test1[0]= 42

        ////Test for third ***
//        System.out.println(maxValue(test1));
//        System.out.println(maxValue(test2));
//        System.out.println(maxValue(test3));

        ////Test for fourth ****
//        double[] sumTest1 = {4.2,7.3,9.8, 1.0, 6.5};
//        double[] sumTest2 = {0.0, 4d, 0, 4d, 2d};
//        double[] sumTest3 = {0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8};
//
//        System.out.println("Print from return:" +sumOfValues(sumTest1)+"\n");
//        System.out.println("Print from return:" +sumOfValues(sumTest2)+"\n");
//        System.out.println("Print from return:" +sumOfValues(sumTest3)+"\n");
//
        //// Test for fifth *****
//        char[] chars1 = {'g','a','t','o'};
//        char[] chars2 = {'t','r','e','e',' ','f','i','t','t','y'};
//        char[] chars3 = {'4','2','a','7','c','3','k'};
//
//        System.out.println("Print from outside of Function:" +charsToString(chars1)+"\n");
//        System.out.println("Print from outside of Function:" +charsToString(chars2)+"\n");
//        System.out.println("Print from outside of Function:" +charsToString(chars3)+"\n");
        //// Test for sixth ******
//        String line1 = "I'm sorry.";
//        String line3 = "I wasn't paying attention.";
//        String line2 = "I was just thinking";
//        String line4= "how weird it is";
//        String line5 = "that we eat birds.";
//
//        System.out.println("Print the return:"+ createStringList(line1, line2, line3, line4, line5));

        ////Test for seventh *******
//        ArrayList<String> script = new ArrayList<>();
//        script.add("What");
//        script.add(" is");
//        script.add(" this,");
//        script.add(" backwards");
//        script.add(" day?");
//
//        reversedStringOrder(script);

        ////Test for eighth ********
//        String[] dry= {"We", " come"," from", " the", " land", " of", " ice", " and", " snow", " From", " the", " midnight", " sun", " where", "the", " hot", "springs", "flow"};
//        ArrayList<String> stringL1= new ArrayList<>();
//        ArrayList<String> stringL2= new ArrayList<>();
//        ArrayList<String> stringL3= new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            stringL1.add(dry[i]);
//
//        }
//
//        for (int i = 0; i < dry.length; i++) {
//            stringL2.add(dry[i]);
//        }
//
//        for (int i = 0; i <9 ; i++) {
//            stringL3.add(dry[i]);
//        }
//
//        System.out.println(printOrAdd(stringL1)+"\n");
//        System.out.println(printOrAdd(stringL2)+"\n");
//        System.out.println(printOrAdd(stringL3)+"\n");


        ////Setup for ninth--------------- *********
//        int[] numSet1= {0,14,42,24,41,53};
//        int[] numSet2= {2,5,0};
//        int[] numSet3={42};
//        int[] numSet4={7,2,9,404,73,81,18};
////
//        ////Test for ninth--------------- *********
//        int[] resultingArray = findMiddle(numSet4); //Determine which set you want to test
////
////
//        if (resultingArray.length == 2){
//            System.out.println("The 2 mid values, since array size is even:"+resultingArray[0]+" "+ resultingArray[1]);
//        }else {
//            System.out.println("The midpoint value is: " +resultingArray[0]);
//        }


    }

    //1. First function of lab--------------------------- *
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

    //2. Second function of lab----------------------- **
    public static void reversedOrder(){
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= i;
        }
        for (int i = nums.length-1; i >=0; i--) {
            System.out.println(nums[i]);
        }
    }

    //3. Third function of lab--------------------------- ***
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

    //4. Fourth function of lab----------------------****
    public static double sumOfValues(double[] dubArr){
        double sum = 0;
        for (double d: dubArr){
            sum+=d;
        }
        System.out.println("Print from function:" + sum);
        return sum;
    }

    //5. Fifth function of lab-----------------------*****
    public static String charsToString(char[] chars){
        String word = "";
        for (char c: chars){
            word += String.valueOf(c);
        }
        System.out.println("Print from within function:" +word);
        return word;
    }


    //6. Sixth function of lab--------------------------******
    public static List<String> createStringList(String... strings){
        ArrayList<String> myStringList = new ArrayList<>();
        for (String string:strings){
            myStringList.add(string);
        }
        System.out.println(myStringList);
        return myStringList;
    }

    //7. Seventh function of lab--------------------------*******
    public static void reversedStringOrder(ArrayList<String> stringArrayList){
        for (int i = stringArrayList.size()-1; i>=0 ; i--) {
            System.out.println(stringArrayList.get(i));
        }


    }

    //8. Eighth function of lab----------------------------********
    public static List<String> printOrAdd(ArrayList<String> stringList){
        if (stringList.size()<10){
            while (stringList.size()<10){
                stringList.add("Ahhh ahh!");
            }
        }else if (stringList.size()>10){
            System.out.println("Size of list is too large. I shortened it down to 10 for you.");
            return stringList.subList(0,10);
        }
        return stringList;

    }


    //9. Ninth function of lab--------------------------------*********
    public static int[] findMiddle(int[] intArr){
        int midPoint = intArr.length/2;
        if (intArr.length%2 == 0){
            int[] middle = {intArr[midPoint-1], intArr[midPoint]};
            System.out.println("Since the array is of even length, these are the two numbers in the middle:" + middle[0]+ middle[1]);
            return middle;
        }else if(intArr.length==1){
            System.out.println("Only 1 value in array.");
            return intArr;
        } else{
            int[] middle = {intArr[midPoint]};
            System.out.println("print from within Function:" + intArr[midPoint]);
            return middle;
        }

    }

}