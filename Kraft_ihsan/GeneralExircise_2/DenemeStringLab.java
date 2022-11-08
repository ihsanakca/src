package GeneralExircise_2;

import java.util.Arrays;
import java.util.Scanner;

public class DenemeStringLab {


    public static void kesEkle(String str1) {


        String newStr = str1.substring(str1.length() - 3);
        String newStr2 = newStr.concat(str1.substring(0, str1.length() - 3));
        System.out.println(newStr2);
    }


    public static String changeWord(String str, String old, String new1) {
        return str.replaceFirst(old, new1);
    }

    public static String threeTimes(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.substring(i, i + 1);
            }

        }
        return result;
    }

    public static int kacAdet(String str, String target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }

    public static int kacAdetVar(String str, String target) {
        int count = 0;

        for (int i = 0; i < str.length() - (target.length() - 1); i++) {
            if (str.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }

    public static boolean controlSenteces(String word, String control) {

        if (word.substring(0, control.length()).equalsIgnoreCase(control) ||
                word.substring(1, 1 + control.length()).equalsIgnoreCase(control)) {
            return true;
        }

        return false;
    }

    public static String firstFive(String str) {

        String nokta = "";
        if (str.length() >= 5) {
            return str.substring(0, 5);
        }
        for (int i = 0; i < 5 - str.length(); i++) {
            nokta += ".";
        }
        return str.concat(nokta);
    }

    public static String firstFive2(String str) {


        if (str.length() >= 5) {
            return str.substring(0, 5);
        }
        String nokta = ".....";
        return str.concat(nokta).substring(0, 5);
    }


    public static boolean firstLastTwo(String str) {
        return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));

    }

    public static boolean firstLastTwo2(String str) {
        String str1 = str.toLowerCase();
        return str1.endsWith(str1.substring(0, 2));

    }

    public static boolean firstLastTwo3(String str) {
        String start = "", end = "";
        for (int i = 0; i < 2; i++) {
            start += str.charAt(i);
        }
        for (int i = str.length() - 2; i < str.length(); i++) {
            end += str.substring(i, i + 1);
        }
        return start.equalsIgnoreCase(end);
    }

    public static boolean firstLastTwo4(String str) {
        String start = "", end = "";
        for (int i = 0, j = str.length() - 2; i < 2; i++, j++) {
            start += str.charAt(i);
            end += str.substring(j, j + 1);
        }
        return start.equalsIgnoreCase(end);
    }

    public static String adSoyad(String adSoyad) {
        String adSoyad1 = adSoyad.trim();
        String[] sArr = adSoyad1.split(" ");
        return "Soy isminiz...(" + sArr[sArr.length - 1] + ")..dır.";
    }

    public static String adSoyad2(String adSoyad) {
        String adSoyad1 = adSoyad.trim();
        return "Soy isminiz...(" + adSoyad1.substring(adSoyad1.lastIndexOf(" ") + 1) + ")..dır.";
    }

    public static String adSoyad3(String adSoyad) {
        adSoyad = adSoyad.trim();
        String result = "";
        for (int i = adSoyad.length() - 1; i >= 0; i--) {
            if (adSoyad.charAt(i) == ' ') {
                result = "Soy isminiz...(" + adSoyad.substring(i + 1) + ")..dır.";
                break;
            }
        }
        return result;
    }

    public static String adSoyad4(String adSoyad) {
        String adSoyad1 = adSoyad.trim();
        int count = 0;
        for (int i = 0; i < adSoyad1.length(); i++) {
            if (adSoyad1.charAt(i) == ' ') {
                count = i;
            }

        }
        return adSoyad1.substring(count + 1);
    }

    public static void main(String[] args) {

//      kesEkle();

//        System.out.println(changeWord("Merhaba", "ha", "cuk"));
//        System.out.println(threeTimes("İhsan"));
//        System.out.println(kacAdet("Ankara","a"));
//        System.out.println(kacAdetVar("anaknanrana", "ana"));
//        System.out.println(controlSenteces("ka racalar", "a raca"));
//        System.out.println(firstFive2("Burs"));
//        System.out.println(firstFive("Bur"));
//        System.out.println(firstLastTwo("kafkA"));
//        System.out.println(firstLastTwo2("kafkA"));
//        System.out.println(firstLastTwo2("kafkA"));
//        System.out.println(firstLastTwo2("kafkA"));
//        System.out.println(adSoyad("  İhsan Umut Akçair Yılmaz   "));
//        System.out.println(adSoyad2("  İhsan Umut Yılmaz   "));
//        System.out.println(adSoyad3("İhsan Umut Yılmaz"));
//        System.out.println("Soy isminiz...("+adSoyad4("  İhsan Umut Güler Azalmaz   ")+")..dır.");
//        System.out.println(firstLastTwo(adSoyad4("  İhsan Umut Güler Azalmaz   ")));
//        System.out.println(omitRepeatingLetter("Hasan bugün bize geldi."));
        System.out.println(uniqeLetter("karkas rotası"));
    }

    public static String omitRepeatingLetter(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.substring(0, 1);
            str = str.replace(str.substring(0, 1), "");

        }

        return result;
    }

    public static String uniqeLetter(String str) {
        String result = "";
        String control = "";

    ihsan:while (!str.isEmpty()) {
            control = str.substring(0, 1);
            if (control.equals(" ")) {
                str = str.replace(control, "");
                continue ihsan;
            }
            str = str.replaceFirst(str.substring(0, 1), "");
            if (str.contains(control)) {
                str = str.replace(control, "");

            } else {
                result += control;

            }
        }
        if (result.equals("")) {
            return "Benzersiz harf yoktur.";
        } else {
            return result.substring(0, 1);
        }

    }
}