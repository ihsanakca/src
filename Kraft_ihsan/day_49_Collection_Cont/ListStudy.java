package day_49_Collection_Cont;

import java.util.*;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>(Arrays.asList(10,70,50,40,100));
        System.out.println("lst = " + lst);

        //accessing items
        System.out.println("lst.get(0) = " + lst.get(0));

//        adding with index

        lst.add(0,11);
        System.out.println("lst = " + lst);
        System.out.println("lst.get(0) = " + lst.get(0));

        // updating items
        lst.set(0,10); //lst = [10, 10, 70, 50, 40, 100]
        System.out.println("lst = " + lst);
//        lst.add(20);//en sona ekleme yapıyor...
//        System.out.println("lst = " + lst);

        //getting index of item
        System.out.println("lst.indexOf(10) = " + lst.indexOf(10));
        System.out.println("lst.indexOf(40) = " + lst.indexOf(40));
        System.out.println("lst.indexOf(1000) = " + lst.indexOf(1000));//olmayan elemanın indexi -1 olarak dönüyor.

        //remove with index
        lst.remove(0);
        System.out.println("lst = " + lst);  //lst = [10, 70, 50, 40, 100]

        //add all
        lst.addAll(Arrays.asList(60,80));
        System.out.println("lst = " + lst);  //lst = [10, 70, 50, 40, 100, 60, 80]
        lst.addAll(2,Arrays.asList(30,90));// lst = [10, 70, 30, 90, 50, 40, 100, 60, 80]
        System.out.println("lst = " + lst);

        //sort
//        lst.sort(null);
        System.out.println("lst = " + lst);//lst = [10, 30, 40, 50, 60, 70, 80, 90, 100]
//        lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);
        lst.sort(Comparator.reverseOrder());//lst = [100, 90, 80, 70, 60, 50, 40, 30, 10]
        System.out.println("lst = " + lst);

        //sublist (from, to)
        System.out.println("subList(2,6) = " + lst.subList(2, 6));
        List<Integer> subList3_8=lst.subList(3,8);
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        subList3_8.set(1,555);//sublistte yapılan değişiklik asıl listi de değiştirir.
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        lst.set(5,556);//listte olan değişiklik de subliste yansır.
        System.out.println("lst = " + lst);
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("-------------------------------");
        //list iterator
//lst = [100, 90, 80, 70, 555, 556, 40, 30, 10]
        final ListIterator<Integer> listIterator = lst.listIterator();
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        //System.out.println(listIterator.next());

        while (listIterator.hasNext()){
            Integer next=listIterator.next();
            System.out.println(next);
            if(next>40){
                listIterator.remove();
            }
        }
        System.out.println("lst = " + lst);//lst = [40, 30, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
      //  System.out.println("listIterator.previous() = " + listIterator.previous());
        while (listIterator.hasPrevious()){
             Integer previous = listIterator.previous();
             if (previous<40){
                // listIterator.remove();//40
               //  listIterator.set(2022);//lst = [40, 2022, 2022]
                 listIterator.add(333);
             }
        }
        System.out.println("lst = " + lst);
    }
}
