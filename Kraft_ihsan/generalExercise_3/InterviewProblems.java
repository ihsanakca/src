package generalExercise_3;

import java.util.Arrays;

public class InterviewProblems {
    public static void main(String[] args) {
        int arr[]={2,1,4,5,6,9,7,11};
        System.out.println(Arrays.toString(indexOfTwoSum(arr, 10)));

    }
    public static int[] indexOfTwoSum(int [] arr, int target){
        int result[]=new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
