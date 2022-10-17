package bootCamp;

import java.util.Arrays;

public class B5_Arrays {
    public static void main(String[] args) {

        int[] nums=new int[8];
        System.out.println(Arrays.toString(nums));//[0, 0, 0, 0, 0, 0, 0, 0]
        nums[0]=2;
        System.out.println(Arrays.toString(nums));//[2, 0, 0, 0, 0, 0, 0, 0]
        nums[1]=5;
        nums[2]=7;
        nums[3]=10;
        nums[4]=21;
        nums[5]=13;
        nums[6]=9;
        nums[7]=25;
        System.out.println(Arrays.toString(nums));//[2, 5, 7, 10, 21, 13, 9, 25]

        final int[] ints = Arrays.copyOfRange(nums, 2, nums.length);
        System.out.println(Arrays.toString(ints));//[7, 10, 21, 13, 9, 25] son değeri almadığındab lenght-1 demiyoruz.

        int[] nums2={2,4,6,1,78,11,4,};
        System.out.println(nums2.length);//7

        int[] nums3=new int[]{4,54,2,7,90,3};
        System.out.println(nums3.length);//6

        int[] reverse=new int[nums2.length];

        for (int i =nums2.length-1,j=0; i >=0; i--,j++) {
            reverse[j]=nums2[i];

        }
        System.out.println(Arrays.toString(reverse));

        int[] reverse2=new int[nums3.length];
        System.out.println(Arrays.toString(nums3));

        for (int i = reverse2.length-1; i >=0 ; i--) {
            reverse2[reverse2.length-1-i]=nums3[i];
        }
        System.out.println(Arrays.toString(reverse2));

        //nums u sorting yani sıralama yapalım...


        int [][] numbers =new int[2][];

        numbers[0]=new int[3];
        numbers[1]=new int[4];

        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;

        numbers[1][0]=60;
        numbers[1][1]=70;
        numbers[1][2]=80;
        numbers[1][3]=90;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");

            }


        }
        System.out.println();
        System.out.println(Arrays.deepToString(numbers));
    }
}
