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
        double fiyat1,fiyat2,fiyat3,toplamFiyat;
        String kitap1,kitap2,kitap3;
        Scanner sc=new Scanner(System.in);
        System.out.println("kitap1 in ismini ve fiyatını girin: ");
        kitap1=sc.nextLine();
        fiyat1=sc.nextDouble();

        Scanner sc1=new Scanner(System.in);
        System.out.println("kitap2 in ismini ve fiyatını girin: ");
        kitap2=sc1.nextLine();
        fiyat2=sc1.nextDouble();

        Scanner sc2=new Scanner(System.in);
        System.out.println("kitap3 in ismini ve fiyatını girin: ");
        kitap3=sc2.nextLine();
        fiyat3=sc2.nextDouble();


        System.out.println("kitap1 fiyatı:"+fiyat1+", Kitap2 fiyatı:"+fiyat2+", Kitap3 fiyatı:"+fiyat3);

        System.out.println("Toplam Fiyat:"+(fiyat1+fiyat2+fiyat3));

    }
}