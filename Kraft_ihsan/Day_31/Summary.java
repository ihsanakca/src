package Day_31;

import java.util.ArrayList;

public class Summary {
    public static void main(String[] args) {

        int x=5;
        System.out.println(x);

        Integer y=new Integer(5);

        System.out.println(x==y);
        System.out.println(y.equals(x));

        String z=new String("harun");

        int x1=Integer.parseInt("5");
        System.out.println(x1);

        String a=String.valueOf(5);
        System.out.println("a = " + a);


        System.out.println(Character.isAlphabetic('ç'));
        System.out.println(Character.isLetter('ç'));
        System.out.println(Character.isDigit('2'));

        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);

        ArrayList <Integer> arrayList2=new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(10);
        arrayList2.add(15);

       // System.out.println("arrayList = " + arrayList);

       // System.out.println(arrayList.get(0));
       // System.out.println("arrayList.remove(0) = " + arrayList.remove(0));
      //  System.out.println("arrayList = " + arrayList);
       // arrayList.add(0,14);
       //arrayList.set(0,14);
        //System.out.println("arrayList = " + arrayList);

        //arrayList.clear();
        //System.out.println("arrayList = " + arrayList);


        System.out.println(arrayList.equals(arrayList2));

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);


    }
}
