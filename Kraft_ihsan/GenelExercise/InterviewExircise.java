package GenelExercise;

import java.util.*;

public class InterviewExircise {
    public static void main(String[] args) {

        //List içerindeki polindrom kelimeleri list içerisinden silen metodu yazınız.interview question.
        //polindrom=tersten ve düzden okunuşu aynı olan kelimeler.

        String str = "kol lok tot bol lob kapak tır yatay tar rat kısık";

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

        for (int i = 0; i < strList.size(); i++) {
            for (int j = 0; j < strListReverse.size(); j++) {
                if (strList.get(i).equals(strListReverse.get(j))) {
                    strList.remove(i);
                    strListReverse.remove(j);
                }
            }

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
//        System.out.println("reverse = " + reverse);

        String[] strArray = str.split(" ");
//        System.out.println("strArray = " + Arrays.toString(strArray));

        String[] strArrayReverse = reverse.split(" ");
//        System.out.println("strArrayReverse = " + Arrays.toString(strArrayReverse));

        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
//        System.out.println("strList = " + strList);

        List<String> strListReverse = new ArrayList<>(Arrays.asList(strArrayReverse));

//        System.out.println("strListReverse = " + strListReverse);

        List<String> strListReverse2=new ArrayList<>();

        for (int i = strListReverse.size()-1; i >=0 ; i--) {

            strListReverse2.add(((strListReverse.size()-1)-i),strListReverse.get(i));
        }
//        System.out.println("strListReverse2 = " + strListReverse2);

        for (int i = 0; i <strListReverse2.size() ; i++) {
                if(strList.get(i).equals(strListReverse2.get(i))){
                    strList.remove(i);
                    strListReverse2.remove(i);

            }
//            System.out.println(strList);
//            System.out.println(strListReverse2);
        }


        return  strList;

    }
}

