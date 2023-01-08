package GeneralExircise_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplitExample {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumFirstAndSecond()));

    }
    public static int[] sumFirstAndSecond(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Arrayin uzunluğunu giriniz: ");
        int length=scanner.nextInt();
        int []arr=new int[length];
        System.out.println("Arrayin elemanlarını giriniz: ");
        for (int i = 0; i <length ; i++) {
            arr[i]=scanner.nextInt();
        }
        if (length<2){
            return arr;
        }else {
            int [] resultArr=new int[length-1];
            resultArr[0]=arr[0]+arr[1];
            for (int i = 1; i < resultArr.length; i++) {
                resultArr[i]=arr[i+1];
            }
            return resultArr;
        }

    }
}
