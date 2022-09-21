package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class arrayList_6 {
    public static void main(String[] args) {

        ArrayList <String> fruitInBasket =new ArrayList<>();
        fruitInBasket.add("Elma");
        fruitInBasket.add("Armut");
        fruitInBasket.add("Kayısı");
        fruitInBasket.add("Üzüm");
        fruitInBasket.add("Erik");

        ArrayList <String> fruitInPlate =new ArrayList<>();
        fruitInPlate.add("Armut");
        fruitInPlate.add("Kayısı");
        fruitInPlate.add("Üzüm");

        fruitInBasket.removeAll(fruitInPlate);
        System.out.println("fruitInBasket = " + fruitInBasket);

        ArrayList <Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);

        printListNumbers(listOfNums);

        System.out.println("\nsum(listOfNums) = " + sum(listOfNums));

        ArrayList<Integer> myList = getList(20);
        System.out.println("getList() = " + getList(20));
        System.out.println("myList = " + myList);

        System.out.println("random(20) = " + random(20));

        ArrayList <String> stringNums=new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");

        System.out.println("toIntList(stringNums) = " + toIntList(stringNums));

        System.out.println( toIntList(stringNums).get(0) + toIntList(stringNums).get(1));

        System.out.println("Arrays.toString(toIntArr(stringNums)) = " + Arrays.toString(toIntArr(stringNums)));
    }

    public static void printListNumbers (ArrayList <Integer> numbers){
        for (Integer I:numbers) {
            System.out.print(I+" ");

        }
    }

    public static int sum(ArrayList<Integer> numbers){
       int toplam=0;
        for (Integer I:numbers) {
            toplam+=I;

        }
        return toplam;
    }

    public static ArrayList<Integer> getList (int i){
        ArrayList <Integer> list=new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            list.add(j);


        }
        return list;
    }

    public static ArrayList<Integer> random(int param){
        Random rm=new Random();
        ArrayList<Integer> rmList=new ArrayList<>();
        for (int i = 1; i <=param ; i++) {
        rmList.add(rm.nextInt(param)+1);
        }
return rmList;
    }

public static ArrayList<Integer> toIntList(ArrayList<String> strNums){
        ArrayList <Integer> intList=new ArrayList<>();
    for (String s:strNums) {
        intList.add(Integer.valueOf(s));
       // intList.add(Integer.parseInt(s));// bununla da sonuc alınır ama valueof kullanılmalı...
        
    }
    return intList;
}

public static int [] toIntArr(ArrayList<String> strNums){
        int [] myArr=new int[strNums.size()];
    for (int i = 0; i <strNums.size() ; i++) {
        myArr[i]=Integer.parseInt(strNums.get(i));
    }
return myArr;
    }
}

