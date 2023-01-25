package generalExercise_3;

import java.util.*;

public class ÖzYineleyenMetod {
    public static void main(String[] args) {
//        geriSayım(14);
//        geriSayım2(15);
//        String str = "Sağlık, sadece hastalık ve sakatlık durumunun olmayışı değil kişinin";
        // reverseWord(str);
        // reverseWord2(str);

        //reverseString(str);


//        System.out.println(sumToX(25));
//        System.out.println("sumToX2(25) = " + sumToX2(25));
//        System.out.println(sumToX3(25));

        //printStarTriangle(6);
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//        int[] mergedArray = mergeArrays(array1, array2);
//
//        System.out.println(Arrays.toString(mergedArray));
//        geriSayım(15);

//        reverseWord("kale");

        //geriSayim(10);

        ileriSayim(0);

    }

    public static void geriSayım(int n) {
        if (n > 0) {
            System.out.println(n);
            n--;
            geriSayım(n);
        } else {
            System.out.println("Done!!");
        }
    }

    public static void geriSayım2(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
            if (i == 1) System.out.println("Done!!");
        }
    }

    public static void reverseWord(String str) {
        String control = "";
        control += str.substring(0, 1);
        str = str.replaceFirst(str.substring(0, 1), "");
        if (str.length() > 0) {
            reverseWord(str);
        }
        System.out.print(control);

    }

    public static void reverseWord2(String str) {
        System.out.print(str.substring(str.length() - 1));
        str = str.substring(0, str.length() - 1);
        if (str.length() > 0) {
            reverseWord(str);
        }
    }

    public static int sumToX(int x) {
        int sum = 0;
        if (x == 1) return 1;
        sum += sumToX(x - 1) + x;
        return sum;
    }

    public static int sumToX2(int x) {
        int sum = 0;
        if (x == 1) return 1;
        sum += sumToX2(x - 1) + x;
        return sum;
    }

    public static int sumToX3(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static void reverseString(String str) {
        System.out.print(str.substring(str.length() - 1));
        str = str.substring(0, str.length() - 1);
        if (str.length() > 0) {
            reverseString(str);
        }
    }

    public static void printStarTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        return mergedArray;
    }

    public static void geriSayim(int n) {
        if (n > 0) {
            System.out.println(n);
            n--;
            geriSayim(n);
        } else {
            System.out.println("Bitti!!");
        }
    }

    public static void ileriSayim(int n) {
        if (n<=100){
        System.out.print(n + " ");
        n++;
        ileriSayim(n);
    }else{
            System.out.println("done!!");
        }
    }
}
