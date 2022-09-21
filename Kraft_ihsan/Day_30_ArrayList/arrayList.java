package Day_30_ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ayşe");
        names.add("Zehra");

        System.out.println("names.size() = " + names.size());
        System.out.println("names.toString() = " + names.toString());
        System.out.println("names = " + names);

        names.set(2,"Fatma");
        System.out.println("names = " + names);

        names.add(2,"Ayşe");
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());

        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.clear();
        System.out.println("names.isEmpty() = " + names.isEmpty());
        System.out.println(names.size()==0);//true döndürür....
        boolean b=names.size()==0;
        System.out.println("b = " + b);
        System.out.println("isEmpty = " + names.isEmpty());


    }
}
