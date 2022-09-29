package day_47_ExceptionCont;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {
        //int değişken kabul eden bir metot yazın.
        //kullanıcıdan tek bir giriş sağlayın.
        //kullanıcı integer dışında bir değer girerse hata mesajı "lutfen tekrar deneyiniz."verin.
        //kullanıcı doğru giriş yapana kadar. kullanıcıdan veri almaya devam edin

        /*boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Sayı: ");
                int x = scan.nextInt();
            } catch (Exception e) {
                System.out.println("lutfen tekrar deneyiniz");
                continue;
            }
            System.out.println("programdan çıkış yapılıyor");
            devam=false;

        }*/

        // kullanıcıdan  2 int sayı alın. 1. sayıyı ikinci sayıya bölün kalanı ekrana yazdırın
        //iki adet catch bloğu  kullanın.

        boolean devam = true;

        while (devam) {
            Scanner scan = new Scanner(System.in);
            try {

                System.out.println(" sayı giriniz");
                int x = scan.nextInt();
                System.out.println("bölüm giriniz");
                int y = scan.nextInt();
                System.out.println("sonuç: " + (x / y));
            } catch (ArithmeticException a) {
                System.out.println("Aritmetik bir hata mevcut, tekrar deneyiniz.");
                continue;
            } catch (Exception e) {
                System.out.println("Hata alındı, tekrar deneyiniz.");
                continue;
            }finally {
                System.out.println("Finally blok çalıştı.");
            }

            devam = false;

        }
    }
}