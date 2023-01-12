package day_24_ArrayCont;

import java.util.Arrays;
import java.util.Random;

public class ArraysLab {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        int count = 0;

        int[] clone = array.clone();

        int [][] dimArr=new int[3][2];
        dimArr[0][0]=2;
        System.out.println("Arrays.deepToString(dimArr) = " + Arrays.deepToString(dimArr));


        for (int i : array) {
//            System.out.println(i);
            array[count] = i + 23;
            count++;
        }

        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        }

        int[] cloneArray = array.clone();
//        System.out.println(Arrays.toString(cloneArray));

        String[] strArry = new String[3];
        strArry[0] = "Muhammed";
        strArry[1] = "Alparslan";
        strArry[2] = "Hatice";


//        System.out.println(Arrays.toString(strArry));

        /*int[] iArray = new int[6];
        iArray[0] = 50;
        iArray[1] = 20;
        iArray[2] = 30;
        iArray[3] = 40;
        iArray[4] = 50;
        iArray[5] = 60;*/



//        int[] iArray2 = new int[4];

//        System.out.println(arrayLenght(iArray2));
//        System.out.println(arrayControl(iArray,50));
//        Random random = new Random();
//        System.out.println(arrayControl(intArr, random.nextInt(10)));

//        System.out.println(firstIndex(intArr, iArray));

//        System.out.println(Arrays.toString(newArrFromFirst(iArray, intArr)));
//        System.out.println(newArrFromFirst(iArray2, intArr));//referansı yazdırır. arrayi toString metodu ile yazdırabiliriz.

//        System.out.println("sumArr(iArray) = " + sumArr(iArray));
//        System.out.println("sumArr(intArr) = " + sumArr(intArr));

//        System.out.println(Arrays.toString(combineArrays2(iArray, intArr)));

//        System.out.println(sumOfArr(intArr));
        int[] intArr = {2, 3,5,6};
        int[] intArr2 = {2, 3,5,36,3,5,0,-5};
       // System.out.println(Arrays.toString(combineArr(intArr, intArr2)));


//        System.out.println(diffMaxAndMin(intArr));

//        System.out.println(Arrays.toString(fillWithMin(intArr)));

//        System.out.println(Arrays.toString(combineArr(intArr, intArr2)));

       // System.out.println(arrControl(intArr, intArr2));
    }

    public static boolean arrayLenght(int[] iArr) {
        return iArr.length > 5; //boolean

    }

    public static boolean arrayControl(int[] iArr, int parameter) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == parameter) {
                return true;
            }
        }
        return false;
    }

    public static boolean firstIndex(int[] arr1, int[] arr2) {
        return arr1[0] == arr2[0]; //boolean

    }

    public static int[] newArrFromFirst(int[] arr1, int[] arr2) {
        int result[] = {arr1[0], arr2[0]};
        return result;
    }

    public static int sumArr(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i];
        }
        for (int i = arr1.length,j=0; i < resultArr.length; i++,j++) {
            resultArr[i] = arr2[i - arr1.length];
           // resultArr[i] = arr2[j];

        }
        return resultArr;
    }

    public static int[] combineArrays2(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < resultArr.length; i++) {
            if (i < arr1.length) {
                resultArr[i] = arr1[i];
            } else {
                resultArr[i] = arr2[i - arr1.length];
            }

        }
        return resultArr;
    }
    public static int sumOfArr(int [] arr){
        int sonuc=0;
        for (int i = 0; i <arr.length ; i++) {
            sonuc+=arr[i];
        }
        return sonuc;
    }

    public static int diffMaxAndMin(int [] arr){
        int control=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    control=arr[j];
                    arr[j]=arr[i];
                    arr[i]=control;
                }
            }



        }return arr[arr.length-1]-arr[0];
    }
    public static int[] fillWithMin(int [] arr){
        int control=0;
        int result[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    control=arr[j];
                    arr[j]=arr[i];
                    arr[i]=control;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                result[i]=arr[0];
            }


        }return result;
    }

    public static int[] combineArr(int a [], int b []){
        int result[]=new int[a.length+b.length];
        for (int i = 0; i < a.length+b.length; i++) {
            if (i<a.length){
                result[i]=a[i];
            }else {
                result[i]=b[i-(a.length)];
            }
        }
        return result;
    }

    public static boolean arrControl(int [] a, int [] b){
        int count=0;
        ihsan:for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]){
                    count++;
                    continue ihsan;
                }
            }
        }
        return count==a.length;
    }
}