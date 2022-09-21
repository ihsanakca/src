package Day_30_ArrayList;

import java.util.ArrayList;

public class arrayList_5 {
    public static void main(String[] args) {

        ArrayList <String> weekDays=new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList <String> allDays=new ArrayList<>(weekDays);

        System.out.println("allDays.get(0) = " + allDays.get(0));
        System.out.println("allDays = " + allDays);

        // ArrayList <String> alterDays =allDays; // new keywordu olmadığından aynı referansı kullanıyorlar...
        // alterDays.set(0,"Pazartesi");
        // System.out.println("after set alterDays Pazartesi allDays.get(0) = " + allDays.get(0));


        allDays.add("Saturday");
        allDays.add("Sunday");

        System.out.println("allDays = " + allDays);

        System.out.println("allDays.contains (Tuesday) = " + allDays.contains("Tuesday"));

        System.out.println("allDays.indexOf(\"Tuesday\") = " + allDays.indexOf("Tuesday"));

        System.out.println( allDays.get(1) == "Tuesday");

        System.out.println("allDays.get(1).equals(\"Tuesday\") = " + allDays.get(1).equals("Tuesday"));

        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));

        System.out.println("weekDays.containsAll(allDays) = " + weekDays.containsAll(allDays));

    }
}
