package Day_25;

import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {


        int[] iArr = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println("checkLenght(iArr) = " + checkLenght(iArr));
        //System.out.println("findFive(iArr) = " + findFive(iArr));
        //System.out.println(bigOne(iArr));
        // System.out.println(Arrays.toString(swapFirstAndLast(iArr)));
        // System.out.println(Arrays.toString(reverseArray(iArr)));
        // System.out.println(sumOfOdd(iArr));
        String str1 = "merhaba java insanları bugün nasılsınız";
        // System.out.println(Arrays.toString(stringToArray(str1)));

        String str2 = "kayısı, armut, çilek, elma, nar";

       // System.out.println(Arrays.toString(stringToArrays2(str2)));
       // System.out.println(Arrays.toString(stringToArrays3(str2)));
        // System.out.println(Arrays.toString(stringToArrays4(str1)));

        int[] sayılar = {14, 25, 43, 44, 5, 64, 71};
       // System.out.println((arithmetic(sayılar)));
       // System.out.println(Arrays.toString(fillWithSmallestElement(sayılar)));
        //System.out.println(Arrays.toString(fillWithSmallestElement2(sayılar)));
//        System.out.println(Arrays.toString(integerToArrays(37)));



    }

    public static boolean checkLenght(int[] iArr) {
        return iArr.length > 5;
    }

    public static boolean findFive(int[] iArr) {
        int parameter = 5;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == parameter) {
                return true;
            }
        }
        return false;
    }

    public static int bigOne(int iArr[]) {
        int max = 0;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] > max) {
                max = iArr[i];
            }

        }

        return max;
    }

    public static int[] swapFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int ints[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[(arr.length - 1) - i];
        }
        return ints;
    }

    public static int sumOfOdd(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }

        return sum;
    }

    public static String[] stringToArray(String str) {
        return str.split(" ");
    }

    public static String[] stringToArrays2(String str) {
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() < 5) {
                split[i] = "çilek";
            }
        }
        return split;
    }

    public static String[] stringToArrays3(String str) {
        String[] split = str.split(", ");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;
        return split;
    }

    public static String[] stringToArrays4(String str) {
        String[] arr = str.split(" ");
        return arr[1].split("");

    }

    public static int[] integerToArrays(int n){
    int [] arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
    arr[i]=i;
    }
  return arr;
    }

    public static int arithmetic(int[] arr){
        Arrays.sort(arr);
        return (arr[0]+arr[arr.length-1])/2;
    }

    public static int[] fillWithSmallestElement (int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,arr[0]);
        return arr;
    }
    public static int[] fillWithSmallestElement2 (int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,0,arr.length-1,arr[0]);
        return arr;
    }
}

