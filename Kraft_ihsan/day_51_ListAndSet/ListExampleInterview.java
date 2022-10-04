package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExampleInterview {
    public static void main(String[] args) {

        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,3,2,0,0,6,3,0,3,2));

        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Mehmet","Harun","İhsan","Orhan","Mehmet"));

        //list içerisindeki listin sonuna yazan metodu yazın.
        System.out.println(sifirSonaTasi(list2));
        System.out.println(sifirSonaTasi2(list2));

        System.out.println(removeName(list, "mehmet"));




    }
    public static List<Integer> sifirSonaTasi(List<Integer> list){
       int originalSize=list.size();
       list.removeAll(Arrays.asList(0));
       int newSize=list.size();
        for (int i = 0; i <originalSize-newSize ; i++) {
            list.add(0);
        }
        return list;
        }

    public static List<Integer> sifirSonaTasi2(List<Integer> list){
        int coount=0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)==0){
                list.remove(i);
                coount++;
            }
        }
        for (int i = 0; i <coount ; i++) {
            list.add(0);
        }return list;
    }

    // interview sorusu:list içerisnde mehmet olan tüm isimleri silin;

    public static List<String> removeName(List<String> list, String data){
        Iterator<String> iter= list.iterator();
        while (iter.hasNext()){
            if(iter.next().equalsIgnoreCase(data)){
                iter.remove();
            }
        }
        return list;
    }
    //List içerindeki polindrom kelimeleri list içerisinden silen metodu yazınız.interview question.
    //polindrom=tersten ve düzden okunuşu aynı olan kelimeler.

    //ödev-2
    //list içerinden polindrom kelimeler vrsa list içerisinden her iki kelimeyi de silen metodu yazınız..
}
