package GeneralExircise_2;

import java.util.Arrays;
import java.util.Scanner;

public class DenemeStringLab {
    public static void main(String[] args) {

//      kesEkle();
        uniqeLetter();

    }

    public static void kesEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz :");
        String str1 = scan.nextLine();

        String newStr = str1.substring(str1.length() - 3, str1.length());
        String newStr2 = newStr.concat(str1.substring(0, str1.length() - 3));
        System.out.println(newStr2);
    }

    public static void uniqeLetter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz :");
        String str = scan.nextLine();
        String str1 = str.toLowerCase();
        String result="";

        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str1.length() ; j++) {
                if (str1.charAt(i)!=str1.charAt(j)){
                    result+=str1.charAt(i);
                }
            }
        }

        System.out.println(result);

        }
    }

