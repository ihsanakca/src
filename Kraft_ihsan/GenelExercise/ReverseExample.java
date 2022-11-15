package GenelExercise;

import GeneralExircise_2.ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseExample {
    public static void main(String[] args) {

        String str="oto adanada ey ye utu ütü umut ada ile beraber ata bindi ooo omo";
        String strReverse="";
        for (int i =  str.length()-1; i >=0; i--) {
            strReverse+=str.charAt(i);
        }
//        System.out.println("strReverse = " + strReverse);

        String[] strArr = str.split(" ");
        String[] strReverseArr = strReverse.split(" ");

     System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
       System.out.println("Arrays.toString(strReverseArr) = " + Arrays.toString(strReverseArr));

        List<String> strArrList=new ArrayList<>(Arrays.asList(strArr));
        List<String> strArrReverseList=new ArrayList<>(Arrays.asList(strReverseArr));
        System.out.println("strArrList = " + strArrList);
        System.out.println("strArrReverseList = " + strArrReverseList);


//        System.out.println("strArrList.removeAll(strArrReverseList) = " + strArrList.removeAll(strArrReverseList));
//        System.out.println("strArrList = " + strArrList);

        for (int i = 0; i < strArrList.size();i++) {
            for (int j = strArrReverseList.size()-1; j >=0 ; j--) {
                if(strArrList.get(i).equals(strArrReverseList.get(j))){
                    strArrList.remove(strArrList.get(i));

                }
            }
        }
        System.out.println(strArrList);
    }
}
