package GenelExercise;

import java.util.*;

public class InterviewExircise {
    public static void main(String[] args) {

        //List içerindeki polindrom kelimeleri list içerisinden silen metodu yazınız.interview question.
        //polindrom=tersten ve düzden okunuşu aynı olan kelimeler.

        String str = "kol lok tot bol lob kapak tır kayak yatay tar rat kısık";

        System.out.println("removeReverse(str) = " + removeReverse(str));
        System.out.println("removeReverse2(str) = " + removeReverse2(str));
        System.out.println("removeReverse3(str) = " + removeReverse3(str));


    }

    public static List<String> removeReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        String[] strArray = str.split(" ");
        String[] strArrayReverse = reverse.split(" ");

        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
        List<String> strListReverse = new ArrayList<>(Arrays.asList(strArrayReverse));

        for (int i = 0; i < strList.size();) {
            for (int j = 0; j < strListReverse.size();) {
                if (strList.get(i).equals(strListReverse.get(j))) {
                    strList.remove(strList.get(i));
                    strListReverse.remove(strListReverse.get(j));
                    continue;
                }j++;continue;
            }i++;

        }

        return strList;

    }

    public static List<String> removeReverse2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        String[] strArray = str.split(" ");
        String[] strArrayReverse = reverse.split(" ");

        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
        List<String> strListReverse = new ArrayList<>(Arrays.asList(strArrayReverse));

        strList.removeAll(strListReverse);

        return  strList;

    }

    public static List<String> removeReverse3(String str) {
//        System.out.println("str = " + str);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        String[] strArray = str.split(" ");
        String[] strArrayReverse = reverse.split(" ");

        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
        List<String> strListReverse = new ArrayList<>(Arrays.asList(strArrayReverse));

        List<String> strListReverse2=new ArrayList<>();

        for (int i = strListReverse.size()-1; i >=0 ; i--) {

            strListReverse2.add(((strListReverse.size()-1)-i),strListReverse.get(i));
        }

        for (int i = 0; i <strListReverse2.size() ; ) {
                if(strList.get(i).equals(strListReverse2.get(i))){
                    strList.remove(strList.get(i));
                    strListReverse2.remove(strListReverse2.get(i));
                    continue;

            }i++;
        }


        return  strList;
    }
}

