package day_51_ListAndSet;

import java.util.*;

public class ListHomeWork_1 {
    public static void main(String[] args) {
        //List içerindeki palindrom kelimeleri list içerisinden silen metodu yazınız.interview question.
        //polindrom=tersten ve düzden okunuşu aynı olan kelimeler.

        //ödev-2
        //list içerinden palindrom kelimeler vrsa list içerisinden her iki kelimeyi de silen metodu yazınız..

        List<String> list = new ArrayList<>(Arrays.asList("ey", "edip", "adanada", "pide", "ye"));
        //  System.out.println("removePalindromList(list) = " + removePalindromList(list));

        //System.out.println("removePalindromListWithIterable(list) = " + removePalindromListWithIterable(list));

        System.out.println(allPalindromClearList(list));

    }

    public static List<String> removePalindromList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(reversePalindrom(list.get(i)))) ;
            list.remove(list.get(i));
        }
        return list;
    }

    public static List<String> removePalindromListWithIterable(List<String> list) {
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {

            String str = iter.next();

            if (str.equals(reversePalindrom(str))) {
                iter.remove();
            }
        }

        return list;
    }

    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;

    }

    public static List<String> allPalindromClearList(List<String> list){

        // List<String> newList=new ArrayList<>(list);
        for ( int i = 0; i <list.size();) {
            String reverStr=reversePalindrom(list.get(i));

            if(list.contains(reverStr)){
                list.removeAll(Arrays.asList(list.get(i),reverStr));
                continue;
            }
            i++;
        }

        return list;

    }
}

