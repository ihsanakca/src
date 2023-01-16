package GeneralExircise_4;

import java.util.Arrays;

public class JavaInterview {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(9, 1)));

    }
    //Problem: Rotate an array of n elements to the right by k steps. For example, with
    //n= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

    public static int[] rotateArray(int n, int k) {
        int[] arrResult = new int[n];

        for (int j=0,i = k; j < k; i--,j++) {
            arrResult[j] = (n - i) + 1;
        }
        for (int i = k,j=1; i <n ; i++,j++) {
            arrResult[i]=j;
        }
        return arrResult;
    }
}
