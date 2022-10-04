package day_52_Set_Collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Example {

    public static void main(String[] args) {
      /*  Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);

        System.out.println("set = " + set);*/

        Set<String> set=new HashSet<>();
        set.add("Ahmet");
        set.add("35");
        set.add("Ahmet");
        set.add("Mehmet");

        String a=new String("Ahmet");
        set.add(a);


        System.out.println("set = " + set);
    }
}
