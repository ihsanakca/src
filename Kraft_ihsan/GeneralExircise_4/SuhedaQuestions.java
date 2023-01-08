package GeneralExircise_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SuhedaQuestions {
    public static void main(String[] args) {
//
//        stars();
     System.out.println("rakamToplami(2542) = " + rakamToplami(2542));

//        System.out.println("obebToplami(60) = " + obebToplami(60));
//        obebToplami1(60);

        int[] nums = {};
//        System.out.println("sumMinMax(nums) = " + sumMinMax(nums));
//        System.out.println("sumMinMax2(nums) = " + sumMinMax2(nums));
//
//        String s="Konuşma dilinde karşılığı olmayan yabancı kelimeler dilden atılagelmiştir. " +
//                "Tüm yabancı dil kuralları terk edilmiş, Türk diline Türk dilbilgisi hâkim kılınmıştır.";
//        System.out.println("longestElement(s) = " + longestElement(s));
//        System.out.println("longestElement(s).length() = " + longestElement(s).length());

        int multiDimNums[][]={{2,3,6},{3,2,5},{2,3,6},{11,12,13}};

        printDimensonalArray(multiDimNums);

        System.out.println(LocalTime.now());

        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();
        System.out.println(first);

    }

    public static void stars() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10 - i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int rakamToplami(int i) {
        int sonuc = 0;
        while (i != 0) {
            sonuc += (i % 10);
            i = i / 10;
        }
        return sonuc;
    }

    public static int obebToplami(int x) {
        int sonuc = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sonuc += i;
            }

        }
        return sonuc;
    }

    public static void obebToplami1(int x) {
        int deger = x;
        int bolen = 1;
        int tamBolenlerToplami = 0;
        while (bolen <= deger) {
            if (deger % bolen == 0) {
                System.out.println(deger + " sayısı " + bolen + " sayısına tam bölünür.");
                tamBolenlerToplami = tamBolenlerToplami + bolen;
            }
            bolen++;
        }
        System.out.println("\n" + deger + " sayısının tam bölenlerinin toplamı: " + tamBolenlerToplami);
    }

    public static int sumMinMax(int arr[]) {
        if (arr.length == 0) return 0;

        int cloneArr[] = arr.clone();
        Arrays.sort(cloneArr);
        return cloneArr[0] + cloneArr[cloneArr.length - 1];
    }

    public static int sumMinMax2(int arr[]) {
        if (arr.length == 0) return 0;

        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return min + max;
    }
    public static String longestElement(String str){

        String[] s = str.split(" ");
        int max=s[0].length();
        int control=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length()>max){
                max=s[i].length();
                control=i;
            }
        }
        return s[control];

    }
    public static void printDimensonalArray(int arrMulti[][]){
        for (int arr [] :arrMulti ) {
            for (int i:arr ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


}

