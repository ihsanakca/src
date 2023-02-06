package extra2;

import java.util.*;


public class Examples29Ocak {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add(3);
        list1.add(2);
        list1.add("li");
        list1.add(8.9);
        list1.add(2);
        System.out.println("containsUnique(list1) = " + containsUnique(list1));
        System.out.println("containsUnique2(list1) = " + containsUnique2(list1));
        System.out.println("containsUnique3(list1) = " + containsUnique3(list1));
        System.out.println("containsUnique4(list1) = " + containsUnique4(list1));
        System.out.println("containsUnique5(list1) = " + containsUnique5(list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(58);
        list2.add(33);
        list2.add(21);
        list2.add(88);
        list2.add(89);
        list2.add(2);
 Collections.sort(list2);
        System.out.println("list2 = " + list2);


//        System.out.println("sortedList(list2) = " + sortedList(list2));

        // one-line methods
        int a = 3;
        int b = 4;
        a = a + b;
        b = a - b;
        a = a - b;
        // a = a ^ b ^ (b = a);
//        int temp = a; // temporary variable
//        a = b; b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static boolean containsUnique(List<Object> list) {

        Set<Object> set = new HashSet<>();
        for (Object l : list) {
            if (!set.add(l)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsUnique2(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean containsUnique3(List<Object> list) {
        return list.size() == list.stream().distinct().count();
    }

    public static boolean containsUnique4(List<Object> list) {
        return list.stream().allMatch(new HashSet<>()::add);
    }

    public static List<Integer> sortedList(List<Integer> list) {
       int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }

        }
        return list;
    }

    public static <C> boolean containsUnique5(List<C> list) {
        Set<C> set = new HashSet<>();
        for (C c : list) {
            if (!set.add(c))
                return false;
        }
        return true;
    }
}