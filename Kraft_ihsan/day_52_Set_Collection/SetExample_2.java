package day_52_Set_Collection;

import java.util.*;

public class SetExample_2 {

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,5,6,7,8));

        //Union-Birleşim
//        set1.addAll(set2);
//        set1.forEach(f-> System.out.print(f+" "));

        //Kesişim-Intersection

//        set1.retainAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        //fark-difference item
//        set1.removeAll(set2);
//        set1.forEach(v-> System.out.print(v+" "));

        set2.removeAll(set1);
        set2.forEach(c-> System.out.print(c+" "));
    }
}
