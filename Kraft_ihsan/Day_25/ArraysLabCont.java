package Day_25;

import java.util.Arrays;

public class ArraysLabCont {
    public static void main(String[] args) {

        int nums[]={25,2,-3,-3,0,1};
        System.out.println(Arrays.toString(fromSmallToBig(nums)));

    }
    public static int[] fromSmallToBig(int [] arr){
        int control;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    control=arr[i];
                    arr[i]=arr[j];
                    arr[j]=control;
                }
            }
        }
        return arr;
    }
}
