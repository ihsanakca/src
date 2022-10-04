package GenelExercise;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Example_DoWhile {

    public static void main(String[] args) {

        Integer[] arr={1,2,3,4};

        int i=0;
        do {
            System.out.println(arr[i]);
            i++;
        }while (i< arr.length);
    }
}
