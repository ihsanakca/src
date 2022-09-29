package day_46_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFaktoryelOrnek {
    public static void main(String[] args) {

//kullanıcıdan bir sayı alın ve bu sayının faktoryelini alarak ekrana sonucunu yazdırın...

        Scanner scan=new Scanner(System.in);
        System.out.println("faktoryeli alınacak sayıyı giriniz :");
        double faktNum=scan.nextDouble();


        faktoryelAlma(faktNum);

    }
    public static void faktoryelAlma(double a){
        int sonuc=1;
        try {
            if (a<0){throw new ArithmeticException(" Eksi sayıların faktoryeli olmaz.");
            } else if (a==0) {sonuc=1;

            } else if (!((int)a-a==0)) {throw new InputMismatchException("Girdiğiniz sayı tamsayı değildir.");
                
            } else{
                for (int i = 1; i <=a ; i++) {
                sonuc=sonuc*i;

            }
            }System.out.println(sonuc);

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
