package day_49_Collection_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll=new ArrayList<>(Arrays.asList(3,5,7,10,20));
        System.out.println("cll = " + cll);
//        for (Integer each:cll) {
//            System.out.println( each);
//            if(each>5){
//                cll.remove(each);
//
//            }
//        } //we can not use remove or update items

        Iterator<Integer> myItter = cll.iterator();
/*
        //next
        System.out.println("myItter.next() = " + myItter.next());
       // System.out.println("myItter.next() = " + myItter.next());

        myItter.remove();
        System.out.println("cll = " + cll);//cll = [5, 7, 10, 20] 1. indexeki 3 ü attı
        myItter.remove();//hata verir. remove dan önce next yapılmalı.
        System.out.println("myItter.next() = " + myItter.next());
        myItter.remove();
        System.out.println("cll = " + cll);

 */
//cll = [3, 5, 7, 10, 20]
        while (myItter.hasNext()){
            Integer next = myItter.next();
            System.out.println(next);
            if(next>5){
                myItter.remove();
            }
        }

        System.out.println("cll = " + cll);
        System.out.println(myItter.hasNext());//iterasyon son indexe kadar gitti. artık gidecek yer yok. false verir.
        cll.add(200);
        System.out.println(myItter.hasNext());//şimdi true olur. 200 ekledikten sonra.Bu collectionda next yapamayız artıl
                                                // bunu yani cll'yi myItter'dan başka bir diziye atamalıyız. Orda next 
                                                //yapabiliriz.Iterator<Integer> myItter = cll.iterator(); bu şekilde
                                                // asingment yapabiliriz.


    }
}
