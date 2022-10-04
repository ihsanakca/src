package day_51_ListAndSet;


import day_40_Interface.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //bir arrayi listin içerisine alan ve list return eden bir metod yazınız.

        int [] arr={1,2,3,4,5,5,6,3,5};
        Integer [] arr1={1,2,3,4,5,5,5,3,6,5,8};

        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,3,2,3,6,6,3,5,3,2));


//        System.out.println(addListMethod(arr));
//
//        System.out.println(addListMethod2(arr1));
//
//        List<Integer> list2=new ArrayList<>(addListMethod(arr));
//        System.out.println(list2.get(0));

       // System.out.println(deleteData(list2, 6));

        System.out.println(removeListMethod(list2, 3));
        System.out.println(removeListMethod2(list2, 6));
        System.out.println(removeListMethod3(list2, 6));
        System.out.println(list2);

        System.out.println(removeListMethod4(list2, 3));


    }

    public static List<Integer> addListMethod(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = arr.length-1; i >=0; i--) {      //tersten yazdırma...
            list.add(arr[i]);
        }return list;
    }

        public static List<Integer> addListMethod2(Integer[] arr){
        List<Integer> list=new ArrayList<>();
        list= Arrays.asList(arr);
        return list;
        }

        //içerisine bir list ve data kabul eden ve bu datayı bütün listeden silen
   // sonucunda nir integer list döndüren metodu yazdırın.

    public static List<Integer> deleteData(List<Integer> lst, int n){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i<lst.size(); i++) {
            list.add(lst.get(i));

    }
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(n)){
                list.remove(i);
            }
        }
          return list;
        }

    public static List<Integer> removeListMethod(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod2(List<Integer> list,Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }
    public static boolean removeListMethod3(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(data));
    }

    public static List<Integer> removeListMethod4 (List<Integer> list, Integer data){
        Iterator<Integer> iter=list.iterator();
        while (iter.hasNext()){
            if(iter.next().equals(data)){
                iter.remove();
            }
        }return list;
    }
}
