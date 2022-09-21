package GenelExercise;

import java.util.Arrays;

public class generalTasks {
    public static void main(String[] args) {

      /*  String str="merhaba java insanları";
        String [] arry=str.split(" ");
        System.out.println(arry[0]);
        arry[1]="yurdum";
        System.out.println(Arrays.toString(arry));
        String [] arry2=str.split("a");
        System.out.println(Arrays.toString(arry2));


        int[] arrys ={1,2,3,4,5,6,7,8,9};
        int[] ints =Arrays.copyOfRange(arrys, 2,6);
        System.out.println(Arrays.toString(ints));

        int[] arrys2 ={1,2,9,4,3,6,7,10,5,8};
        Arrays.sort(arrys2);
        System.out.println(Arrays.toString(arrys2));
        */

        int[] arrys2 ={1,2,9,4,3,6,7,10,5,8};
        Arrays.fill(arrys2,22);
        System.out.println(Arrays.toString(arrys2));
        Arrays.fill(arrys2,2,3,5);
        System.out.println(Arrays.toString(arrys2));
    }
}
