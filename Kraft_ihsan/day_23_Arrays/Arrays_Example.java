package day_23_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Example {
    public static void main(String[] args) {

        Random random = new Random();

        int countÇift = 0;
        int countTek = 0;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0) {
                countÇift++;
            }else {
                countTek++;
            }
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("array[17] = " + array[17]);
        System.out.println(("Tek sayı sayısı =" + countTek + " ve çift sayı sayısı =" + countÇift));
        System.out.println(array.length);
    }
}
