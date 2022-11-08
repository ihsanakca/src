package generalExercise_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Permutations_1 {
    public static void main(String[] args) {

        String s = "car";
        printStrings("car", "");


//          String string = "cara";        // listli çözüm
//          Permutations(string);


//        String str = "java";         // boolean çözüm
//        Permutations(str,"");


    }

    //------------------------Birinci method ile çözüm----------------------

    static void printStrings(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String ros = str.substring(0, i) +str.substring(i + 1);
            // Calling the function recursively
            printStrings(ros, ans + ch);
        }
    }// printStrings




    //-----------------------------List ile Çözüm-----------------------

    public static void Permutations(String s)
    {
        if (s == null || s.length() == 0)
        {
            return;
        }
        List<String> result = new ArrayList<>();
        result.add(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++)
        {
            for (int j = result.size() - 1; j >= 0 ; j--)
            {
                String s1 = result.remove(j);
                for (int k = 0; k <= s1.length(); k++)
                {
                    result.add(s1.substring(0, k) + s.charAt(i) + s1.substring(k));
//                    System.out.println("result = " + result);
                }
            }
        }
        Set<String> newSet= new TreeSet<>();
        newSet.addAll(result);
        System.out.println(newSet);
    }

//------------------------------Boolean ile çözüm-------------------------


    static void Permutations(String s1,String ans) {
        if (s1.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        boolean a[] = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            String ros = s1.substring(0, i) + s1.substring(i + 1);
            if (a[c - 'a'] == false)
                Permutations(ros, ans + c);
            a[c - 'a'] = true;
        }
    }
}
