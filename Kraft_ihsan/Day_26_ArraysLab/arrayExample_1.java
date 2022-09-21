package Day_26_ArraysLab;

import java.util.Arrays;

public class arrayExample_1 {
    public static void main(String[] args) {

        int[] sayilar = {12, 5, 36, 6, 33, 62, 30, 21};
        int[] sayilar2 = {124, -5, -36, 666, 933, 562, -30, -21};

        //System.out.println(toplam(sayilar));
        // System.out.println(toplamCift(sayilar));
        // System.out.println(toplamUc(sayilar));
        //System.out.println(enBuyukEnKucukFark(sayilar));
        // System.out.println(Arrays.toString(enKucukTumIndeks(sayilar)));
        //System.out.println(Arrays.toString(araSayilariAta(6, 11)));
        System.out.println(Arrays.toString(arrayBirlestir(sayilar, sayilar2)));

    }

    public static int toplam(int[] arr) {
        int sonuc = 0;
        for (int sayi : arr) {
            sonuc += sayi;
        }
        return sonuc;
    }

    public static int toplamCift(int[] arr) {
        int sonuc = 0;
        for (int sayi : arr) {
            if (sayi % 2 == 0) {
                sonuc += sayi;
            }
        }

        return sonuc;
    }

    public static int toplamUc(int[] arr) {
        int sonuc = 0;
        for (int sayi : arr) {
            if (sayi == 3) {
                sonuc += sayi;
            }
        }

        return sonuc;
    }

    public static int enBuyukEnKucukFark(int[] arr) {
        int enKucuk = arr[0];
        int enBuyuk = arr[0];

        for (int sayi : arr) {
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        return enBuyuk - enKucuk;
    }

    public static int[] enKucukTumIndeks(int[] arr) {
        int[] yeniArray = new int[arr.length];
        int enKucuk = arr[0];
        for (int sayi : arr) {
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = enKucuk;

        }
        return yeniArray;
    }

    public static int[] araSayilariAta(int a, int b) {
        int max = Math.max(a, b);

        if (max == a) {
            int[] yeniArray = new int[(a - b) + 1];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = b + i;

            }
            return yeniArray;
        } else {
            int[] yeniArray = new int[(b - a) + 1];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = a + i;

            }
            return yeniArray;
        }


    }

    public static int[] arrayBirlestir(int []a, int[]b) {
        int[] result= new int[a.length+b.length];
        for (int i = 0,j=0; i <result.length ; i++) {
            if(i<a.length){
                result[i]=a[i];

            } else if (i>a.length-1){
                result[i]=b[j];
                j++;
            }

        } return result;

    }


}

