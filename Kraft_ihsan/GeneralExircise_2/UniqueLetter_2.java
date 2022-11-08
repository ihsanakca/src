package GeneralExircise_2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueLetter_2 {

    public static String uniqeLetter(String str) {
        String str1 = str.toLowerCase().replace(" ", "");

        String control;

        while (!str1.isEmpty()) {
            control = str1.substring(0, 1);
            if (str1.substring(1).contains(control)) {
                str1 = str1.replace(control, "");
                continue;

            }
            return control;
        }

        return "";
    }

    public static String uniqueLetter2(String str){
        String str1=str.toLowerCase().replace(" ","");
        String control;
       for(int i=0;i<str1.length();){
//          if(str1.length()==1) {
//              return str1;}
           control = str1.substring(0, 1);
           if(str1.substring(1).contains(control)){
               str1=str1.replace(control,"");
               continue;
           }return control;
       }
       return "";
    }

    public static String uniqueLetter3(String str){
        String str1=str.toLowerCase().replace(" ","");

        for(int i=0;i<str1.length();i++){
            if(str1.length()-str1.replace(str.substring(i,i+1),"").length()==1){
                return str1.substring(i,i+1);
            }
        }
        return "";
    }

    //Girilen kelimenin tüm harflarinin uniquese true döndüren metodu yazınız...
    public static void main(String[] args) {

        System.out.println(uniqueLetter2("baba"));

    }
    public static boolean allUnique(String str){
        String str1=str.toLowerCase().replace(" ","");
        String control;

        while (!str1.isEmpty()){
            control=str1.substring(0,1);
            str1=str1.replaceFirst(control,"");
            if(str1.contains(control)){
                return false;
            }

        }return true;
    }
    public static boolean allUnique2(String str){
        String str1=str.toLowerCase().replace(" ","");

        for(int i=0;i<str1.length();i++){
            for (int j = i+1; j < str1.length(); j++) {
                if(str1.charAt(i)==str1.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
   public static boolean allUnique3(String str){
       String str1=str.toLowerCase().replace(" ","");
       for (int i = 0; i <str1.length() ;) {
           if(str1.substring(1).contains(str1.substring(0,1))){
               return false;

           }
           str1=str1.replace(str1.substring(0,1),"");

       }
       return true;
   }
public static boolean allUnique4(String str){
    String str1=str.toLowerCase().replace(" ","");
     String[] strArr = str1.split("");

    Set<String> strSet=new TreeSet<>(Arrays.asList(strArr));
    return strArr.length==strSet.size();
}

}
