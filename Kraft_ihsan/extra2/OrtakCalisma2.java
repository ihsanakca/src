package extra2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class OrtakCalisma2 {
    public static void main(String[] args) {

        String str = "123adf234hki15k38l";
        //System.out.println(seperateDigitAndWord(str));

        seperate(str);
        System.out.println("seperateDigitAndWord(str) = " + seperateDigitAndWord(str));
//        System.out.println(seperate2(str));
//        System.out.println(seperateDigitAndWord(str));

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(38);
        list.add(3);
        list.add(5);
        list.add(5);
//
//        System.out.println(list.size() == list.stream().distinct().count());
//        Stream<Integer> sorted = list.stream().sorted();
//        System.out.println("list = " + list);
//        System.out.println("sorted = " + sorted);
//
      // System.out.println("containsUnique(list) = " + containsUnique(list));

       // System.out.println("fizzBuzzer(50) = " + fizzBuzzer(50));


    }

    // 123adf234hk15k3l  -> 123 adf 234 hk 15 k 3 l
    public static List<String> seperateDigitAndWord(String str) {
        List<String> result = new ArrayList<>();
        String control = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                control += chars[i];
            } else {
                if (!control.isEmpty()) {
                    result.add(control);
                }
                control = "";
            }
        }
        if (!control.isEmpty()) {
            result.add(control);
            control = "";
        }
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                control += chars[i];
            } else {
                if (!control.isEmpty()) {
                    result.add(control);
                }
                control = "";
            }
        }
        if (!control.isEmpty()) {
            result.add(control);
            control = "";
        }
        return result;
    }

    public static void seperate(String str) {

        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+|[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println(list);
    }

    public static <T> boolean containsUnique(List<T> list) {
        Set<T> set = new HashSet<>();
        for (T t : list) {
            if (!set.add(t))
                return false;
        }
        return true;

    }

    public static List<Object> fizzBuzzer(int x) {
        List<Object> resultList = new ArrayList<>();
        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("fizzbuzz");
            } else if (i % 3 == 0) {
                resultList.add("fizz");
            } else if (i % 5 == 0) {
                resultList.add("buzz");
            } else {
                resultList.add(i);
            }
        }
        return resultList;
    }
}