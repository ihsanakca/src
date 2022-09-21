package day_35;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç hedefle karşılaştın?");
        int dusman= scan.nextInt();
        System.out.println("Kaçını vurdun?");
        int isabet=scan.nextInt();

        Challenge challenge=new Challenge(dusman,isabet);

        System.out.println(challenge.getRank());


    }
}
