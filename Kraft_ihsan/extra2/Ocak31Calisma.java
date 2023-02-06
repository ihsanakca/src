package extra2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ocak31Calisma {
    public static void main(String[] args) {

        List<Object> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add(3);
        list1.add(32);

//        System.out.println("containsUnique(list1) = " + containsUnique(list1));
//        System.out.println("containsUnique2(list1) = " + containsUnique2(list1));



    }

    public static Object containsUnique6(List<Object> list) {
        Set<Object> set = new HashSet<>();
        for (Object l : list) {
            if (!set.add(l)) {
                return l;
            }
        }
        return -1;
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

    public static <C> boolean containsUnique(List<C> list) {
        Set<C> set = new HashSet<>();
        for (C t : list) {
            if (!set.add(t))
                return false;
        }
        return true;
    }


}