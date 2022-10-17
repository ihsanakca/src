package day_53_Maps;

import java.util.*;

public class MapExampleMain {
    public static void main(String[] args) {

        Map<Integer,Ogrenci> okul=new TreeMap<>();

        Ogrenci ogr1=new Ogrenci("Mehmet","Yılmaz",53);
        Ogrenci ogr2=new Ogrenci("Ahmet","Şen",89);
        Ogrenci ogr3=new Ogrenci("Enes","Çelik",76);
        Ogrenci ogr4=new Ogrenci("Adem","Arslan",20);

        okul.put(278,ogr4);
        okul.put(34,ogr3);
        okul.put(899,ogr1);
        okul.put(25,ogr2);
        okul.put(145,new Ogrenci("Harun","Yıldırım",10));

        //System.out.println(okul.get(25).getSurName());

//        List<Ogrenci> list=new ArrayList<>();   //listte de oluyor.
//        list.add(ogr1);
//        list.add(ogr2);
//        list.add(ogr3);
//        list.add(ogr4);
//
//        System.out.println(list.get(0).getAverageNote());

        okul.get(899).setAverageNote(94.8);
        System.out.println(okul.get(899).getAverageNote());
    }
}
