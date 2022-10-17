package day_54_Collection_Cont;

import java.util.*;
import java.util.function.Predicate;

public class NavigableSetStudy {
    public static void main(String[] args) {
        NavigableSet<Integer> integerNSet=new TreeSet<>();

        integerNSet.add(35);
        integerNSet.add(2);
        integerNSet.add(2);
        integerNSet.add(30);
        integerNSet.add(10);
        integerNSet.add(20);
        integerNSet.add(50);
        integerNSet.add(40);
        System.out.println("integerNSet = " + integerNSet);//[2, 10, 20, 30, 35, 40, 50] sıralı. treeSet ten dolayı

        //lower
        System.out.println("integerNSet.lower(35) = " + integerNSet.lower(35));//30---bir düşüğünü verir.
        //higher
        System.out.println("integerNSet.higher(35) = " + integerNSet.higher(35));//40---bir yükseğini verir.
        //floor
        System.out.println("integerNSet.floor(35) = " + integerNSet.floor(35));//35
        System.out.println("integerNSet.floor(39) = " + integerNSet.floor(39));//35---en yakın alt değeri verir.
        //ceiling
        System.out.println("integerNSet.ceiling(35) = " + integerNSet.ceiling(35));//35
        System.out.println("integerNSet.ceiling(36) = " + integerNSet.ceiling(36));//40---en yakın üst değeri verir.

        //pollFirst
//        integerNSet.clear();
        System.out.println("integerNSet = " + integerNSet);//[2, 10, 20, 30, 35, 40, 50]

        System.out.println("integerNSet.first() = " + integerNSet.first());//Exception verir boşken
        System.out.println("integerNSet.pollFirst() = " + integerNSet.pollFirst());//boşken null verir. 2 olan ilk eleman varsa onu siler ama yazdırır.
        System.out.println("integerNSet = " + integerNSet);//[10, 20, 30, 35, 40, 50]

        //pollLast()
        System.out.println("integerNSet.pollLast() = " + integerNSet.pollLast());//50 olan son elemanı siler ve yazdırır.
        System.out.println("integerNSet = " + integerNSet);//[10, 20, 30, 35, 40]

        //descendingSet()

        integerNSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println("integerNSet = " + integerNSet);//[10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("integerNSet.descendingSet() = " + integerNSet.descendingSet());//[80, 70, 60, 40, 35, 30, 20,10]

        //subSet//[10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("integerNSet.subSet(30,true,70,false) = "
                + integerNSet.subSet(30, true, 70, false));// [30, 35, 40, 60]

        //headSet()
        System.out.println("integerNSet.headSet(40,false) = "
                + integerNSet.headSet(40, false));//40 hariç 40 ın öncesi//[10, 20, 30, 35]
        //tailSet()
        System.out.println("integerNSet.tailSet(40,false) = "
                + integerNSet.tailSet(40, false));//[60, 70, 80] 40 hariç 40 ın sonrası

        System.out.println("integerNSet = " + integerNSet);

//        Iterator<Integer> iterator = integerNSet.iterator();//[10, 20, 30, 35, 40, 60, 70, 80]
//       while (iterator.hasNext()){
//           if(iterator.next()>=40){
//               iterator.remove();
//           }
//       }System.out.println("integerNSet = " + integerNSet);//[10, 20, 30, 35]

        Predicate<Integer> pr=p->(p>=40||p<=20||p==35);
        integerNSet.removeIf(pr);
        System.out.println("integerNSet = " + integerNSet);//[10]

    }
}
