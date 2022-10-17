package day_47_ExceptionCont;
import javafx.scene.chart.ScatterChart;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTryCatch_2 {
    public static void main(String[] args) throws Exception {
        //personel idlerini tutan bir array tanımlayın ve içerisine beş adet int türünde
        //id gönderin arr[]={} bu idlerin içerinde 0 var ise illegalargumentexception hatası döndürün.
        //bunu bir checkArrayId metodunun  içerinde çözün.

        int[] arr1 = {1, 72, 110, 8, 6};
        /*try {
            System.out.println(checkArrayId(arr1));
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("uygun olmayan personel tespit edildi");
        }
        System.out.println("programa devam ediliyor.");*/

        System.out.println(maxNumberIndex(arr1));
        //     System.out.println(maxArray(arr1));
       // minMaxArray(arr1);
        //System.out.println("maxArray_2(arr1) = " + maxArray_2(arr1));


    }

    public static boolean checkArrayId(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new IllegalArgumentException(" personel id sıfır olamaz");
            }

        }
        return false;

    }
    // array tanımlayalım içerisinde en buyuk sayının indeks numarasını getiren metodu yazınız
    // en buyuk sayıdan iki veya daha fazla var ise bir new exception throw edin.

    public static int maxNumberIndex(int array[]) throws Exception {

        int arr[] = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i]=array[i];
        }
        int maxIndex = 0;


        Arrays.sort(arr);
        int x = arr[arr.length - 1];
        if (arr[arr.length - 2] == x) {
            throw new Exception("en buyuk sayıdan iki adet var");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int maxArray(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void minMaxArray(int[] arr) {
        Arrays.sort(arr);
        int minArr = arr[0];
        int maxArr = arr[arr.length - 1];
        System.out.println("maxArr = " + maxArr);
        System.out.println("minArr = " + minArr);
    }

    public static int maxArray_2(int arr[]) {
        int max = arr[0];
        for (int i:arr) {
          if(i>max){
              max=i;
          }
        }
        return max;
    }
}