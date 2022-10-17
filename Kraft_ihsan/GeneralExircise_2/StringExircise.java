package GeneralExircise_2;

import java.util.Arrays;
import java.util.*;

public class StringExircise {
    public static void main(String[] args) {

        String str="Koşan kovalanır, kaçan yakalanır.";
        String str1=str.replace(" ","").replace(",","").replace(".","").toLowerCase();
        System.out.println("str1 = " + str1);
        String str1Reverse="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            str1Reverse+=str1.charAt(i);
        }
        System.out.println("str1Reverse = " + str1Reverse);

        String[] strArray=str1.split("");
        System.out.println(Arrays.toString(strArray));

        String[] strArrayReverse=str1Reverse.split("");
        System.out.println(Arrays.toString(strArrayReverse));

        Set<String> setStr=new TreeSet<>();
        setStr.addAll(Arrays.asList(strArray));
        System.out.println("setStr = " + setStr);

        List<String> listStr=new ArrayList<>();
        listStr.addAll(Arrays.asList(strArray));
        System.out.println("listStr = " + listStr);
        List<String> listStr2=new ArrayList<>();
        for (int i =listStr.size()-1; i >=0 ; i--) {

                listStr2.add(((listStr.size()-1)-i),listStr.get(i));

        }
        System.out.println("listStr2 = " + listStr2);
        listStr.removeAll(setStr);
        System.out.println("listStr = " + listStr);

        int a = 70, b = 40, c = 50, result;

        // result holds max of three
        // numbers
//       result = (a>b)?(a>c):a:c:(c>b)?b:c);
//        System.out.println("Max of three numbers = "
//                + result);

        result=(a>=b)&(a>=c)?a:(b>=c)?b:c;
        System.out.println(result);
    }
}
