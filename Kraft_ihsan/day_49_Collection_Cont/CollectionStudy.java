package day_49_Collection_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class CollectionStudy {
    public static void main(String[] args) {

//        ArrayList<Integer> lst1=new ArrayList<>();
//        List<Integer> list2=new ArrayList<>();//polymorphic way

        Collection<Integer> col=new ArrayList<>();//polymorphic way

//        adding elements or object or items

        col.add(5);col.add(15); col.add(25);col.add(20);col.add(50);
        System.out.println(col);

        //getting size
        System.out.println("size = " + col.size());

        //remove items
        col.remove(15);
        System.out.println(col);//[5, 25, 20, 50]
        System.out.println("col.remove(100) = " + col.remove(100));//olmayan nesne silinmeye çalışılırsa false verir.
        col.add(5);col.add(80);
        System.out.println("col = " + col);//col = [5, 25, 20, 50, 5, 80]
        col.remove(5);
        System.out.println("col = " + col);

        //contains item
        System.out.println("col.contains(50) = " + col.contains(50));//true
        System.out.println("col.contains(1000) = " + col.contains(1000));//false

        //checking empty or not
        System.out.println("col.isEmpty() = " + col.isEmpty());

        //remove all
//        col.removeAll(col);
//        col.removeAll(Arrays.asList(50,500));//remove yapılmak istenen collectionın eleşen elmenlarını siler
        System.out.println("col = " + col);

        //adding all
        col.addAll(Arrays.asList(60,70,90));
        System.out.println("col = " + col);//col = [25, 20, 50, 5, 80, 60, 70, 90]


        //contains all
        System.out.println("containsAll(Arrays.asList(25,20)) = " + col.containsAll(Arrays.asList(25, 20)));
        System.out.println("containsAll(Arrays.asList(25,200)) = " + col.containsAll(Arrays.asList(25, 200)));
        System.out.println("col.containsAll(Arrays.asList(50,90)) = " + col.containsAll(Arrays.asList(50, 90)));
        System.out.println("col = " + col);//col = [25, 20, 50, 5, 80, 60, 70, 90]

        //retain all
//        col.retainAll(Arrays.asList(25,20));
        // col.retainAll(Arrays.asList(225,200));//eğer girilen elemenlar listede yoksa boş bir collection döndürür.
        System.out.println("col = " + col);

        //turning to array
//        Integer[] toArray=col.toArray(new Integer[0]);
        Integer[] toArray=col.toArray(new Integer[0]);//array = [25, 20, 50, 5, 80, 60, 70, 90, null, null, null]
        System.out.println("array = " + Arrays.toString(toArray));
    }
}
