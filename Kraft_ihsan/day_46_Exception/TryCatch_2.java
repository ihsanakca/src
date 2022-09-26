package day_46_Exception;

import java.util.Scanner;

public class TryCatch_2 {
    public static void main(String[] args) {

        boolean devam=true;

        while (devam){
            try {

                Scanner scan =new Scanner(System.in);
                System.out.println("sayı : ");
                int x=scan.nextInt();
                System.out.println("bölüm : ");
                int y=scan.nextInt();
                System.out.println("sonuç : "+(x/y));
                devam=false;
            }catch (Exception e){
//                e.printStackTrace();
//                System.out.println(e.toString());
                System.out.println(e);
                //System.out.println(e.getMessage());
                System.out.println("lutfen tekrar deneyin");
            }
        }
        System.out.println("program sonlandı");
    }
}
