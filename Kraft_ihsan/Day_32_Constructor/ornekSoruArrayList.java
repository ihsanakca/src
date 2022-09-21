package Day_32_Constructor;

import java.util.ArrayList;

public class ornekSoruArrayList {
    public static void main(String[] args) {


ArrayList<Integer> arrList_1=new ArrayList<>();
arrList_1.add(0);
arrList_1.add(1);
arrList_1.add(2);
arrList_1.add(3);
arrList_1.add(4);
arrList_1.add(5);
arrList_1.add(6);
arrList_1.add(7);
arrList_1.add(8);
arrList_1.add(9);

Long start=System.nanoTime();
        System.out.println("kayanList(arrList_1,5) = " + kayanList(arrList_1, 5));
long finish=System.nanoTime();
long result=finish-start;
        System.out.println(result);


    }

    //kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
    //gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
    //metod(sayilar,kaymaMiktari)
    //
    //0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
    //0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1


    public static ArrayList<Integer> kayanList(ArrayList<Integer> sayilar, int kaymaMiktarı){
        ArrayList<Integer> kynList =new ArrayList<>(sayilar.size());
        for (int i = 0; i < kaymaMiktarı; i++) {
            sayilar.add(i, sayilar.get(sayilar.size()-(kaymaMiktarı-i)));
            sayilar.remove(sayilar.size()-(kaymaMiktarı-i));
            kynList=sayilar;

        }
        return kynList;
    }
}
