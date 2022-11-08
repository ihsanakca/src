package GeneralExircise_2;

import java.util.Scanner;

public class UniqueLetter {


    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //ikazı versin.
    //Merhaba M
    //Araba r
    //Karkas rotası o

    public static String uniqeLetter(String str) {
        String str1 = str.toLowerCase();
        String result = "";
        String control;

        ihsan:
        while (!str1.isEmpty()) {
            control = str1.substring(0, 1);
            if (control.equals(" ")) {
                str1 = str1.replace(control, "");
                continue ihsan;
            }
            str1 = str1.replaceFirst(str1.substring(0, 1), "");
            if (str1.contains(control)) {
                str1 = str1.replace(control, "");

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

    public static String adSoyad(String str, String str2) {
        String str3;
        return str3 = "Adınız " + str + " Soyadınız " + str2;
    }
    //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)
    //İftar Tarif true
    //Zehra Ezhar true
    //Nefes Enfes true
    //Selcuk Elyase false

    public static boolean wordControl(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String control;
        while (!str1.isEmpty()) {
            control = str1.substring(0, 1);
            str1 = str1.replaceFirst(control, "");
            if (str2.contains(control)) {
                str2 = str2.replaceFirst(control, "");
            } else {
                return false;
            }
        }
        if (str2.isEmpty()) {
            return true;
        }
        return false;
    }

    //Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
    //yazın.
    //aabccccseeeeeefff acef
    //abaccb c
    //Arsız ardı ardına tekrar eden harf yoktur
    //amannsız n

    public static String repeatingLetters(String str) {
        str = str.toLowerCase();
        String control;
        String result = "";

        while (!str.isEmpty()) {
            control = str.substring(0, 1);
            str = str.replaceFirst(control, "");

            for (int i = 0; i < str.length(); i++) {

                if (str.substring(0, 1).equals(control)) {
                    result += control;
                    str = str.replaceAll(control, "");
                } else {
                    str = str.replaceAll(control, "");
                }
            }

        }
        if (result.equals("")) {
            return "Tekrar eden harf yoktur";

        } else {
            return result;
        }

    }


    //Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat () metodu ile
    //birleştirerek yazdırın.
    //Slm
    //Ali
    //Slm Ali

    public static String concatWords() {
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("En az \"bir\" en fazla \"dört\" harfli iki kelime giriniz... ");
        for (int i = 0; i < 3; i++) {

            System.out.println("Doğru kelimeyi girmek için " + (3 - i) + " hakkınız vardır...");
            System.out.print("Birinci kelime :");
            String str1 = scan.nextLine();
            System.out.print("İkinci kelime :");
            String str2 = scan.nextLine();

            if ((str1.length() < 1 || str1.length() > 4) || (str2.length() < 1 || str2.length() > 4)) {
                System.out.println("Hatalı kelime girdiniz....");

            } else {
                result = str1.concat(" " + str2);
                break;
            }
        }


        return result;

    }

    //Kullanıcıdan bir
    //input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //ekrana yazdırın.
    //Seni seviyorum 1
    //Sevmek veya sevmemek 2
    //Sev seni seveni , sevmek güzeldir. 3

    public static int countSev(String str) {
        str = str.toLowerCase();
        int count = 0;
        String control;
        while (!str.isEmpty()) {
            control = str.substring(0, 1);
            str = str.replaceFirst(control, "");
            if (control.equals("s")) {
                if (str.substring(0, 1).equals("e")) {
                    if (str.substring(1, 2).equals("v")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    //Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa
    //true farklı sayılarda dönüyorsa false yazdıran metodu yazınız.
    //Ankara ile Bursa arası 500 km. True
    //Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //İstanbul çok uzak false

    public static boolean bursaAnkara(String str) {
        str = str.toLowerCase();
        String control;
        int count1 = 0, count2 = 0;
        if (str.contains("bursa") && str.contains("ankara")) {


            while (!str.isEmpty()) {
                control = str.substring(0, 1);
                str = str.replaceFirst(control, "");

                if (str.length() >= 4) {

                    if (control.equals("b")) {
                        if (str.substring(0, 1).equals("u")) {
                            if (str.substring(1, 2).equals("r")) {
                                if (str.substring(2, 3).equals("s")) {
                                    if (str.substring(3, 4).equals("a")) {
                                        count1++;
                                    }
                                }
                            }
                        }
                    } else if (control.equals("a")) {
                        if (str.substring(0, 1).equals("n")) {
                            if (str.substring(1, 2).equals("k")) {
                                if (str.substring(2, 3).equals("a")) {
                                    if (str.substring(3, 4).equals("r")) {
                                        if (str.substring(4, 5).equals("a")) {
                                            count2++;
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
            }
        } else {
            return false;
        }
        if (count1 == count2) {
            return true;
        }
        return false;

    }


    //Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false döndüren metodu yazdırın.
    //Kullanacak true
    //Zamlanacak true
    //Farkındalık false
    // Farkında false

    public static boolean lastingWithAcak(String str) {
        str = str.toLowerCase();
        if (str.contains("acak")) {
            if (str.charAt(str.length() - 1) == 'k') {
                if (str.charAt(str.length() - 2) == 'a') {
                    if (str.charAt(str.length() - 3) == 'c') {
                        if (str.charAt(str.length() - 4) == 'a') {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    public static boolean lastingWithAcak2(String str) {
        String str1 = str.toLowerCase().replace(" ", "");
        if (str1.substring((str1.length() - 4)).equals("acak")) {
            return true;
        }
        return false;
    }


    //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    //yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
    //Merhaba 1m1e1r1h2a1b
    //Seni seviyorum 2s2e1n2i1v1y1o1r1u1m

    public static String letterCount(String str) {
        String str1 = str.toLowerCase().replace(" ", "");
        String result = "";
        int count;
        for (int i = 0; i < str1.length(); ) {
            count = str1.length() - str1.replace(str1.substring(0, 1), "").length();
            result += count + str1.substring(0, 1);
            str1 = str1.replace(str1.substring(0, 1), "");
        }


        return result;
    }

    public static void main(String[] args) {

//        System.out.println(uniqeLetter("alabamabalam"));
//        System.out.println(wordControl("evlat", "velet"));
//        System.out.println(repeatingLetters("amannsız"));
//        System.out.println(concatWords());
//        System.out.println(countSev("Sev seni seveni , sevmek güzeldir"));
//        System.out.println(bursaAnkara("Ankara Bursa kadar yeşil değil. Bursa bir başka."));
//        System.out.println(lastingWithAcak("zamlanaCak"));
//      System.out.println(lastingWithAcak2("bu gördüğün bir bacak"));
        System.out.println(letterCount("Umut Ayhan Akçair"));
        System.out.println(maxLetter("weweemwmmswshwhswwssw"));

    }
    //Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    //Merhaba a
    //aaaaaaabbcccc a
    //eeemmmsssssssssshhhhhhhhhsss s

    public static String maxLetter(String str) {
        String str1 = str.toLowerCase().replace(" ", "");
        String result = "";
        int count = str1.length() - str1.replace(str1.substring(0, 1), "").length();
        int count2;
        for (int i = 0; i < str1.length(); i++) {
            count2 = str1.length() - str1.replace(str1.substring(i, i + 1), "").length();
            if (count2 > count) {
                count = count2;
            }

        }
        for (int i = 0; i < str1.length(); i++) {
            if (count == str1.length() - str1.replace(str1.substring(i, i + 1), "").length()) {
                result = str1.substring(i, i + 1);
                break;
            }

        }
        return result;

    }
}

