package GeneralExircise_2;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Geri sayım için dakika giriniz: ");
        Scanner scan=new Scanner(System.in);
        int minute=scan.nextInt();
        for (int i = minute; i >0 ; i--) {
            if(i<0)
                break;
            for (int j = 59; j >=0 ; j--) {

                for (int k = 99; k >=0 ; k--) {
                    System.out.print("\r"+(i-1)+" minutes and "+j+" seconds and "+k+" cs.");
                   Thread.sleep(10);

                }

            }

        }
        System.out.println("\n");
        System.out.println("|---------------------|");
        System.out.println("|-----TIME IS UP------|");
        System.out.println("|---------------------|");
    }
}
