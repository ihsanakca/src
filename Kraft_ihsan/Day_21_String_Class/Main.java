package Day_21_String_Class;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String str = "Merhaba";
        //System.out.println(str);
       // System.out.println(str.concat(" dünya"));

        String str2=str.concat(" dünya"); //concat ile birleştirirsek hala string olduğundan metot uygulanabilir.
        //System.out.println(str2);

        String str3=str+" dünya";// bu şekilde birleştirme de metot uygulanmaz ve daha yavaştır...
        //System.out.println(str3);

       // System.out.println("str.length() = " + str.length());
       // System.out.println("str.toLowerCase() = " + str.toLowerCase());
       // System.out.println("str.toUpperCase() = " + str.toUpperCase());
      //  System.out.println("str.charAt(0) = " + str.charAt(0));
       // System.out.println("str.charAt(0) = " + str.charAt(2));
       // System.out.println("str.contains() = " + str.contains("a"));
       // System.out.println("str.contains(\"hab\") = " + str.contains("hab"));

        String str4="Merhaba";
        String str5="MERHABA";
       // System.out.println("str4 = " + str4);
        // System.out.println("str4.trim() = " + str4.trim());
       // System.out.println("str4.trim().replace(\" \",\"\") = " + str4.trim().replace(" ", ""));

        //System.out.println(str4.replaceFirst("a", "e"));

        //System.out.println(str4.indexOf("e"));
        //System.out.println(str4.indexOf("aba"));//yoksa -1 verir..

        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str4.toUpperCase().equals(str5.toUpperCase()));


    }
}