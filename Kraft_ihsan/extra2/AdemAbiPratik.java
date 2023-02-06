package extra2;

import java.util.Scanner;

public class AdemAbiPratik {
    public static void main(String[] args) {
        String str = "Kara kulak yaramazlık yapmak";
//        System.out.println("beforeAfter2(str) = " + beforeAfter2(str));
//
//        int index1 = str.indexOf("o");
//        System.out.println("The character before 'o': " + str.charAt(index1 - 1));
//        System.out.println("The character after 'o': " + str.charAt(index1 + 1));

        System.out.println(countLetter(str));
        System.out.println(countLetter2(str));


    }

    public static String beforeAfter1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                result += str.charAt(i - 1);
                result += str.charAt(i + 1);
            }
        }
        return result;
    }

    public static String beforeAfter2(String str) {
        String result = "";
        int index = str.indexOf("o");
        result += str.charAt(index - 1);
        result += str.charAt(index + 1);

        return result;
    }
    /*
    //    Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//    yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//    Merhaba 1m1e1r1h2a1b
//    Seni seviyorum 2s2e1n2i1v1y1o1r1u1m
     */

    public static String countLetter(String str) {
        str = str.toLowerCase().replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            String control = str.substring(0, 1);
            int count = str.length() - str.replace(control, "").length();
            result += count + control;
            str = str.replace(control, "");

        }
        return result;
    }

    public static String countLetter2(String str) {
        str = str.toLowerCase().replace(" ", "");
        String result = "";
        int count = 1;
        for (int i = 0; i < str.length(); ) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result += count + str.substring(0,1);
            count = 1;
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }
}
