package day_55_MapInterface;


import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {
        Map<String,Integer> ageMap=new HashMap<>();

        //Map(K,V)

        //put()
        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayşe",23);

        //size()
        System.out.println("ageMap.size() = " + ageMap.size());//3

        //get(K)
        System.out.println("ageMap.get(\"Mehmet\") = " + ageMap.get("Mehmet"));//25
//        int ageofMehmet = ageMap.get("Mehmet");//unboxed
//        System.out.println("ageofMehmet = " + ageofMehmet);

        //containsKey()
        System.out.println("ageMap.containsKey(\"Mehmet\") = " + ageMap.containsKey("Mehmet"));//true

        //remove()
        System.out.println("ageMap.remove(\"Mehmet\") = " + ageMap.remove("Mehmet"));
        System.out.println("ageMap = " + ageMap);//{Ahmet=24, Ayşe=23}

        //putAll
        Map<String,Integer> ageMap2=new HashMap<>();
        ageMap2.put("Metin",null);
        ageMap2.put("Osman",37);
        ageMap2.put("Hakan",24);
        ageMap2.put("Ahmet",22);
        ageMap2.put("Ahmet",25);

        ageMap.putAll(ageMap2);
        System.out.println("ageMap = " + ageMap);//{Ahmet=25, Ayşe=23, Osman=37, Hakan=24, Metin=null}
        System.out.println("ageMap2 = " + ageMap2);//{Ahmet=25, Osman=37, Hakan=24, Metin=null}

        //clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2);//{}
        System.out.println("ageMap = " + ageMap);//{Ahmet=25, Ayşe=23, Osman=37, Hakan=24, Metin=null}

        //putIfAbsent()
        ageMap.putIfAbsent("Osman",38);//yoksa yerine koyar. varsa değişiklik yapmaz.
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.putIfAbsent(\"Metin\",77) = " + ageMap.putIfAbsent("Metin", 77));//null..metinin yaşı null olduğundan ona 77 atadı.
        System.out.println("ageMap = " + ageMap);
        ageMap.put("Osman",38);
        System.out.println("ageMap = " + ageMap);

        //getOrDefault()
        System.out.println("ageMap.getOrDefault(\"Ayşe\",23) = " + ageMap.getOrDefault("Ayşe", 23));
        System.out.println("ageMap = " + ageMap);

        //remove()
//        System.out.println("ageMap.remove(\"Ayşe\") = " + ageMap.remove("Ayşe"));
//        System.out.println("ageMap.remove(\"Osman\",38) = " + ageMap.remove("Osman", 38));
//        System.out.println("ageMap = " + ageMap);

        //replace()

        System.out.println("ageMap.replace(\"Ayşe\",24) = " + ageMap.replace("Ayşe", 24));//direkt guncelliyor...
        System.out.println("ageMap = " + ageMap);

        System.out.println("ageMap.replace(\"Ayşe\",24,25) = " + ageMap.replace("Ayşe", 24, 25));
        System.out.println("ageMap = " + ageMap);

        System.out.println("ageMap.replace(\"Ayşe\",24,25) = " + ageMap.replace("Ayşe", 24, 25));
        System.out.println("ageMap = " + ageMap);

    }
}
