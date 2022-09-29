package day_48_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Ahmet");
        arrayList.add("Mehmet");
        arrayList.add("Ayşe");
        arrayList.add("Ahmet");


        System.out.println(arrayList.size());


        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
//remove all collection alarak çalışıyor.



    }
}
