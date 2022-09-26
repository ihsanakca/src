package day_46_Exception;

import java.util.Scanner;

public class ExeptionTutorial {
    public static void main(String[] args) {
        System.out.println("program başaldı");
        Scanner scan =new Scanner(System.in);
        System.out.println("sayı : ");
        int x=scan.nextInt();
        System.out.println("bölüm : ");
        int y=scan.nextInt();
        System.out.println("sonuç : "+(x/y));

        System.out.println("program bitti");
    }
}
