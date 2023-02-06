package day_55_MapInterface;

import java.util.*;

public class MapInterfaceStudy_2 {
    public static void main(String[] args) {
        Map<String,Integer> ageMap=new HashMap<>();

        ageMap.put("Mehmet",25);
        ageMap.put("Hatice",24);
        ageMap.put("Ayşe",22);
        ageMap.put("Metin",50);
        ageMap.put("Osman",37);
        ageMap.put("Zeynep",24);
        ageMap.put("Veli",24);
        ageMap.put("Ahmet",25);

        //how to collect all keys of map
        //set<K> keySet()
        //returns a "set view" of the keys contained in the map

         Set<String> stringSet = ageMap.keySet();
        System.out.println("stringSet = " + stringSet);

        //How to remove which have specifik value.
        //How to convert a new map from current map.
        //ages should be under 25.

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
           String next = iterator.next();// kod okunabilirliği açısından bunu yazmak lazım...
             if(ageMap.get(next)>25){
                 iterator.remove();
             }
        }

        System.out.println("ageMap = " + ageMap);

        for (String eachKey:stringSet) {
            if(ageMap.get(eachKey)<=25){
                System.out.println(ageMap.get(eachKey));
            }

        }

        //Collection<V> values()
        //returns a collection view of the values contained in the map

        Collection<Integer> values=ageMap.values();
        System.out.println("values = " + values);

         Iterator<Integer> iterValues = values.iterator();

         while (iterValues.hasNext()){
             Integer next=iterValues.next();
             if (next<24){
                 iterValues.remove();
             }
         }
        System.out.println("ageMap = " + ageMap);
        System.out.println("iterValues.hasNext() = " + iterValues.hasNext());//sona geldiğinden false verir.
        //yeni iterasyon yapmak istersek yeniden nesne oluşturmalıyız.
        Iterator<Integer> iterValues2 = values.iterator();
        System.out.println("iterValues2.hasNext() = " + iterValues2.hasNext());

        //yeni konu
        System.out.println("-------------------------------");

        Map<String,Integer> ageMap2=new HashMap<>();

        ageMap2.put("Mehmet",25);
        ageMap2.put("Hatice",24);
        ageMap2.put("Ayşe",22);
        ageMap2.put("Metin",50);
        ageMap2.put("Osman",37);
        ageMap2.put("Zeynep",24);
        ageMap2.put("Ahmet",24);
        ageMap2.put("Ahmet",25);

        Set<Map.Entry<String, Integer>> entries = ageMap2.entrySet();

        for(Map.Entry<String, Integer> eachEntry:entries){
            System.out.println("eachEntry.getKey() = " + eachEntry.getKey()
            +"---->"+eachEntry.getValue());
            eachEntry.setValue(24);
            if(eachEntry.getValue()==24){
                eachEntry.setValue(eachEntry.getValue()+10);
            }

        }
        System.out.println("ageMap2 = " + ageMap2);
    }
    
}
