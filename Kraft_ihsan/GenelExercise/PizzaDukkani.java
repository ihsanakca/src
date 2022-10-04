package GenelExercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PizzaDukkani {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Isleme Al
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // ISLEME AL (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        //TODO: LocalDateTime siparisZamani; isleme al dendiğinde listede gözüksün

        System.out.println("Lütfen Siparişinizi Veriniz.\nSmall Pizza için-1\nMedium Pizza için-2\nLarge Pizza için-3\nSiparişinizin" +
                " işleme alınması için-4");
        Scanner scan=new Scanner(System.in);
        int small=0,medium=0,large=0;
        boolean devam=true;
        ArrayList<String> aryStr=new ArrayList<>();
        siparis:while (devam) {

            int x = scan.nextInt();
            if (x > 5 || x < 1) {
                System.out.println("Lütfen menüdeki seçeneklerden birini giriniz.");
                continue siparis;
            } else if (x==1) {
                aryStr.add("small");
                continue siparis;
            }else if(x==2){
                aryStr.add("medium");
                continue siparis;
            } else if (x==3) {
                aryStr.add("large");
                continue siparis;
            } else if (x==4) {
                System.out.println("Siparişleriniz aşağıdadır: ");
                devam=false;
            }

            }
        //System.out.println(aryStr);

        for (int i = 0; i <aryStr.size() ; i++) {
            if (aryStr.get(i)=="small"){
                 small++;
            } else if (aryStr.get(i)=="medium") {
                medium++;
            } else if (aryStr.get(i)=="large") {
                large++;

            }


        }System.out.println(small+" adet small pizza sipariş edilmiştir.");
        System.out.println(medium+" adet medium pizza sipariş edilmiştir.");
        System.out.println(large+" adet large pizza sipariş edilmiştir.");

        LocalDateTime tarih = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(tarih));


        }
    }

