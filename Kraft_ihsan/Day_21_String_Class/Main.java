package Day_21_String_Class;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

       /* String str44 = "Merhaba";
        //System.out.println(str);
        // System.out.println(str.concat(" dünya"));

        String str2 = str44.concat(" dünya"); //concat ile birleştirirsek hala string olduğundan metot uygulanabilir.
        //System.out.println(str2);

        String str3 = str44 + " dünya";// bu şekilde birleştirme de metot uygulanmaz ve daha yavaştır...
        //System.out.println(str3);

        // System.out.println("str.length() = " + str.length());
        // System.out.println("str.toLowerCase() = " + str.toLowerCase());
        // System.out.println("str.toUpperCase() = " + str.toUpperCase());
        //  System.out.println("str.charAt(0) = " + str.charAt(0));
        // System.out.println("str.charAt(0) = " + str.charAt(2));
        // System.out.println("str.contains() = " + str.contains("str_1"));
        // System.out.println("str.contains(\"hab\") = " + str.contains("hab"));

        String str4 = "Merhaba";
        String str5 = "MERHABA";
        // System.out.println("str4 = " + str4);
        // System.out.println("str4.trim() = " + str4.trim());
        // System.out.println("str4.trim().replace(\" \",\"\") = " + str4.trim().replace(" ", ""));

        //System.out.println(str4.replaceFirst("str_1", "e"));

        //System.out.println(str4.indexOf("e"));
        //System.out.println(str4.indexOf("aba"));//yoksa -1 verir..

        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str4.toUpperCase().equals(str5.toUpperCase()));

        boolean bl = true;

        String str55 = "daday";
        String str56 = "aday";

        System.out.println(str55.repeat(2));

        System.out.println(str55);

        System.out.println("str55.compareTo(str56) = " + str55.compareTo(str56));

        for(int i=1; i<=5; i++) {
           System.out.println("Karekök içinde "+i*i+" = "+i+" demektir.");
        }*/

        StringBuilder str=new StringBuilder("abc");
        StringBuffer str_1=new StringBuffer("abc");

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("str.reverse() = " + str.reverse());
        System.out.println("str_1.reverse() = " + str_1.reverse());

        String s="America";
        System.out.println("s.substring(0,s.indexOf('c')) = " + s.substring(0, s.indexOf('c')));

        for(int a=1; a<=5; a++) {
            for(int b=1; b<=10; b++) {
                System.out.print((b*a)+"\t");
            }
            System.out.println();
        }
        for (int i =0 ; i<s.length() ; i++){

            char c = s.charAt(i);

            if (c=='c'){
                break;
            }
            System.out.print(c);
        }
        System.out.println();


        int sonuc=0;

        int sayi = 5001;

        while (sayi>0) {

            sonuc+= sayi%10;


            sayi = sayi /10;

        }
        System.out.println(sonuc);



    }
}