package day_46_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowClause {
    public static void main(String[] args) {
//        int x=0;
//try{ if (x==0){
//    throw new ArithmeticException("aritmetik exception hatası");
//}
//}catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//kullanıcıdan bir sayı alın ve bu sayının faktoryelini alarak ekrana sonucunu yazdırın...

        Scanner scan=new Scanner(System.in);
        System.out.println("faktoryeli alınacak sayıyı giriniz :");
        int a=scan.nextInt();
        //buradan sonrasının metod içine alarak yapsana.....
        int sonuc=1;
        try {
            if (a<0){throw new ArithmeticException(" eksi sayıların faktoryeli olmaz.");
            } else if (a==0) {sonuc=1;

            }else{for (int i = 1; i <=a ; i++) {
                sonuc*=i;

            }
            }System.out.println(sonuc);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
