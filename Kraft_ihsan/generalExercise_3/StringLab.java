package generalExercise_3;

import java.util.*;




public class StringLab {
    public static void main(String[] args) {

       System.out.println(combinationWord("kapanak"));
//        System.out.println(içİçeMetot("ihsan"));


    }

    public static List<String> combinationWord(String str) {

        str = str.toLowerCase().replace(" ", "");
        String[] strArr = str.split("");
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));

        int numberOfComb = 1;
        int numberOfPer = 1;
        int count = 0;

        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= str.length(); i++) {
            numberOfComb *= i;
        }
        for (int i = 0; i < str.length(); ) {
            count = str.length() - str.replace(str.substring(0, 1), "").length();
            intList.add(count);
            str = str.replace(str.substring(0, 1), "");
        }
      System.out.println(intList);
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 1; j <= intList.get(i); j++) {
                numberOfPer *= j;
            }

            numberOfComb = (numberOfComb / numberOfPer);
            numberOfPer = 1;
        }

       System.out.println(numberOfComb);


        List<String> resultList = new ArrayList<>();
//        for (int i = 0; i < numberOfComb; i++) {
//           resultList.add("i "+i);
//
//        }

        return resultList;
    }

    public static String içİçeMetot(String str){

        String str1=str.substring(0,1);
        String str2="";

        for (int i=0; i<str.length();){
            if (!str.isEmpty()){
                str1+=str;
                str=str.replace(str.substring(0,1),"");

            }
        }
    if (str1.startsWith("i")){
        str1="h"+str1;
        str2+=içİçeMetot(str1);

    }




        return str1+" "+str2;
    }

}
