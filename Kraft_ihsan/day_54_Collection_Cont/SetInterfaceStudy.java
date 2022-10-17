package day_54_Collection_Cont;

import java.util.*;

public class SetInterfaceStudy {
    public static void main(String[] args) {
        //unique items
        // no dublicate

        Set<Long>  longSet=new HashSet<>();
        System.out.println("longSet.add(7l) = " + longSet.add(7l));//true
        System.out.println("longSet.add(7l) = " + longSet.add(7l));//false
        longSet.add(7l);//false
        longSet.add(7l);//false
        System.out.println("longSet.add(70l) = " + longSet.add(70l));//true
        System.out.println("longSet.add(70l) = " + longSet.add(70l));//false

        System.out.println("longSet = " + longSet);

        for (long each:longSet) {
            System.out.println("--->"+each);
        }

        longSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));

        System.out.println(longSet);

        longSet.add(null);
        longSet.add(null);

        System.out.println("longSet = " + longSet);// sadece bir tane null eklenir sete. dublikasyon yok.

        if(!longSet.add(70l)){
            //item varsa false dondurur ! olduğu için true dönüyor ve body içindeki if condition çalışır.
            longSet.remove(70l);
        }
        System.out.println("longSet = " + longSet);

    }
}
