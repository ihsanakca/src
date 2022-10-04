package GenelExercise;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {

        System.out.println("------------------HOŞGELDİNİZ-------------------\nPizza boyutu için numaraları (1,2,3) kullanabilirsiniz.\nArdından siparişinizin " +
                "işleme alınmasını istiyorsanız lütfen 4 numaraya " +
                "basınız.\nSmall için 1\nMedium için 2\nLarge için 3\nİşleme Almak için 4");

        ArrayList<Integer> arrayList=new ArrayList<>();
        int small=0, medium=0, large=0;

        boolean devam=true;
        while(devam){
            try {
                Scanner s = new Scanner(System.in);
                int x=s.nextInt();

                if(x>=5 || x<=0){
                    System.out.println("işleme devam etmek için menüdeki rakamları kullanınız");
                }else if(x<4){
                    arrayList.add(x);
                }else if(x==4){
                    devam=false;
                }
            }catch (Exception e){
                e.getMessage();
                System.out.println("!!!Hata!!! işleme devam etmek için lütfen menüdeki rakamları kullanınız");
                continue;
            }
        }
        //System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)==1){
                small++;
            }else if(arrayList.get(i)==2){
                medium++;
            }else if(arrayList.get(i)==3){
                large++;
            }
        }
        System.out.println("************************************");
        System.out.println("Smalldan "+small+" adet sipariş verilmiştir.");
        System.out.println("Mediumdan "+medium+" adet sipariş verilmiştir.");
        System.out.println("Largedan "+large+" adet sipariş verilmiştir.");
        System.out.println("************************************");
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Tarih/saat :"+myObj);
    }

}
