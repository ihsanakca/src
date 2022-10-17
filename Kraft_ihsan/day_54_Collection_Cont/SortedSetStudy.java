package day_54_Collection_Cont;

import java.util.SortedSet;
import java.util.*;

public class SortedSetStudy {
    public static void main(String[] args) {

        SortedSet<Integer> integerSortedSet=new TreeSet<>();
//        Set<Integer> integerSortedSet1=new TreeSet<>();

//        NavigableSet<Integer> integerSortedSet2=new TreeSet<>();

        integerSortedSet.add(2);
        integerSortedSet.add(2);
        integerSortedSet.add(10);
        integerSortedSet.add(10);
        integerSortedSet.add(10);

        System.out.println("integerSortedSet = " + integerSortedSet);

        System.out.println("integerSortedSet.first() = " + integerSortedSet.first());
        System.out.println("integerSortedSet.last() = " + integerSortedSet.last());

        integerSortedSet.addAll(Arrays.asList(35,25,45));
        System.out.println("integerSortedSet = " + integerSortedSet);
//        integerSortedSet.add(null);//hata verir. null is not allowed.Çalıştırınca hata verir.
        System.out.println("integerSortedSet = " + integerSortedSet);

        //integerSortedSet = [2, 10, 25, 35, 45]
        //subSet //aralık vererek çalışıyor.

//        System.out.println("integerSortedSet.subSet(10,45) = " + integerSortedSet.subSet(10, 45));//[10, 25, 35]
//        System.out.println("integerSortedSet.subSet(10,46) = " + integerSortedSet.subSet(10, 46));//[10, 25, 35, 45]
//        System.out.println("integerSortedSet.subSet(26,46) = " + integerSortedSet.subSet(26, 46));//[35, 45]
//        System.out.println("integerSortedSet.subSet(3,50) = " + integerSortedSet.subSet(3, 50));//[10, 25, 35, 45]

        System.out.println("integerSortedSet.headSet(35) = " + integerSortedSet.headSet(35));//[2, 10, 25]
        System.out.println("integerSortedSet.headSet(36) = " + integerSortedSet.headSet(36));//[2, 10, 25, 35]

        System.out.println("integerSortedSet.tailSet(35) = " + integerSortedSet.tailSet(35));// [35, 45]
        System.out.println("integerSortedSet.tailSet(36) = " + integerSortedSet.tailSet(36));// [45]

        SortedSet<Integer> myTailSet =integerSortedSet.tailSet(25);
        //[2, 10, 25, 35, 45]
        System.out.println("myTailSet = " + myTailSet);//[25, 35, 45]
        System.out.println("myTailSet.remove(10) = " + myTailSet.remove(10));
        System.out.println("myTailSet.remove(35) = " + myTailSet.remove(35));//içerde var ve remove yapıyorsa true doner.
        System.out.println("myTailSet = " + myTailSet);//[25, 45]
        System.out.println("integerSortedSet = " + integerSortedSet);//[2, 10, 25, 45]

    }
}
