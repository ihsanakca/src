package day_53_Maps;

import java.util.*;

public class ManavMain {
    public static void main(String[] args) {

        Map<String,Manav> manav=new TreeMap<>();

        manav.put("02Elma02",new Manav("Elma",25.99));
        manav.put("Ayva0204",new Manav("Ayva",36.99));

        manav.get("Ayva0204").setFiyat(75.99);
        manav.get("Ayva0204").fiyatArttir(5);
       // System.out.println(manav.get("Ayva0204").getFiyat());

        double  toplamFiyat=0;

        for (String key:manav.keySet()){
            toplamFiyat+=manav.get(key).getFiyat();


        }
        //System.out.println(Math.round(toplamFiyat));

        Map<String,Integer> map=new HashMap<>();

        map.put("Elma",25);
        map.put("Armut",35);

        int result=map.get("Armut")+15;
       // System.out.println(result);


            int result2=0;
        for (String key:map.keySet()) {
            result2+=map.get(key);

        }
        //System.out.println(result2);

        map.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
