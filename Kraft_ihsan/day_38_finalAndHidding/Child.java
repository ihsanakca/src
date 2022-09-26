package day_38_finalAndHidding;
import java.util.*;

import day_38_finalAndHidding.Parent;

public class Child extends Parent {

    public void start2(){
        Parent parent=new Parent();
        System.out.println("num = " + num);

    }
}
class maiin{
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;

        //kod buraya-Değişkenleri burada belirleyin



        Scanner sc = new Scanner(System.in); //buna dokunmayın
        System.out.println("Birinci sayıyı giriniz:");
        sayi1=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        sayi2=sc.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        sayi3=sc.nextInt();
        int sum=sayi1+sayi2+sayi3;
        System.out.println("sayıların toplamı :"+sum);


        //kod buraya



    }
}