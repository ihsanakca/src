package day_53_Maps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {



    List<Integer> list=new ArrayList<>();
    list.add(5);
    list.add(8);

   

//    fenA.forEach((k,v)-> System.out.println(k+"---> "+v));

//   System.out.println(fenA);

//   System.out.println(fenA.get(995));
//
//        System.out.println(fenA.size());
//
//        System.out.println(fenA.toString().toUpperCase());
//        System.out.println(fenA);

//       fenA.remove(895);

//        System.out.println(fenA.containsKey(895));
//        System.out.println(fenA.containsKey(896));

//        System.out.println(fenA.containsValue("Mehmet"));
//        System.out.println(fenA.containsValue("Ayşe"));

//      fenA.replace(895,"Ayşe");

//        System.out.println(fenA.keySet());
//        System.out.println(fenA.values());
        
//        System.out.println(fenA);
        Map <Integer,String> fenA =new LinkedHashMap<>();
        fenA.put(671,"Harun");
        fenA.put(995,"Mehmet");
        fenA.put(895,"Ahmet");
        fenA.put(423,"Ayşe");

        Map <Integer,String> fenB =new LinkedHashMap<>();
        fenB.put(888,"Enes");
        fenB.put(9225,"Beytullah");
        fenB.put(8295,"Bahar");
        fenB.put(4223,"Umut Arslan");

//        for (Integer num:fenA.keySet()) {
//            System.out.println(fenA.get(num));
//        }
List<Map<Integer,String>> okul=new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);

//        System.out.println(okul.size());
//        System.out.println(okul);

//        System.out.println(fenB.get(4223));
//        System.out.println(okul.get(1).get(4223));

//        for(Map<Integer,String> sinif:okul){
//            for (Integer key:sinif.keySet()) {
//                System.out.println(sinif.get(key));
//            }
//
//        }

        for (int i = 0; i <okul.size() ; i++) {
            for (Integer key:okul.get(i).keySet()) {
                System.out.println(okul.get(i).get(key));
            }
        }

        }
}






