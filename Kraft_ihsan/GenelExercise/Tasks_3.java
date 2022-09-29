package GenelExercise;

import java.util.Arrays;

public class Tasks_3 {
    public static void main(String[] args) throws Exception {


        int[] arr = {11, 8, 333, 221, 7, 3};
        System.out.println(maxNumberIndex(arr));

    }

    public static int maxNumberIndex(int array[]) throws Exception {

        // ARRAY KOPYALAMA YOLLARI...5 YOL VAR.

        int arr[] =new int[array.length];  //1. YOL
        for (int i = 0; i <array.length ; i++) {  //1.YOL DEVAMI
            arr[i]=array[i];                      //1.YOL DEVAMI
       }
//int arr []=Arrays.copyOf(array,array.length);//2.YOL
//int arr []=Arrays.copyOfRange(array,0,array.length);//3. YOL
//int arr []=array.clone();//4.YOL
//int [] arr=new int[array.length];//5.YOL
//System.arraycopy(array,0,arr,0,array.length);//5.YOL DEVAMI


        int maxIndex = 0;


        Arrays.sort(arr);
        int x = arr[arr.length - 1];
        if (arr[arr.length - 2] == x) {
            throw new Exception("en buyuk sayıdan iki adet var");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                maxIndex =i;
            }

        }
       return maxIndex;

    }
}
