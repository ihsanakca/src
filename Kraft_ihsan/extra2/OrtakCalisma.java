package extra2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrtakCalisma {
    public static void main(String[] args) {
        String[] arr = {"bc6ad", "Pune", "623", "Mumbai", "10" };
        //letterOrDigit(arr);

        List<String> ls = new ArrayList<>(Arrays.asList(arr));

//        String arrDim [][]=new String[2][2];
//        arrDim[0][0]="a";
//        arrDim[0][1]="b";
//        arrDim[1][0]="c";
//        arrDim[1][1]="d";

//        System.out.println("Arrays.deepToString(arrDim) = " + Arrays.deepToString(arrDim));

//        System.out.println("ls = " + ls);

        String[] strings = ls.toArray(new String[ls.size()]);

//        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));

//        for (int i = 0; i < strings.length; i++) {
//            System.out.println("strings["+i+"] = " + strings[i]);
//        }

        String [] strings1=new String[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            strings1[i]=ls.get(i);
        }
        System.out.println("Arrays.toString(strings1) = " + Arrays.toString(strings1));


//        while (!arr[1].isEmpty()) {
//            String control = arr[1].substring(0, 1);
//            if (Character.isDigit(control.charAt(0))) {
//                System.out.println("");
//            }
//            arr[1] = arr[1].replaceFirst(control, "");
//        }

//        digitAndLetterArr(arr);
    }
    //Create a method in this class that takes a List of strings as the only argument.
    // Each string in this list will be a single word containing either alphabets a through z or digits 0 through 9
    // (for example, “cb5ad”, “Pune”, “623”, “Mumbai”, “10”, etc.
    // 123adf234hk15k3l  -> 123 adf 234 hk 15 k 3 l

    public static void letterOrDigit(String[] arr) {
        int digit = 0;
        int letter = 0;

        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j))) {
                    count1++;
                }
            }
            if (count1 == arr[i].length()) {
                letter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isDigit(arr[i].charAt(j))) {
                    count++;
                }
            }
            if (count == arr[i].length()) {
                digit++;
            }

        }
        System.out.println("digit = " + digit);
        System.out.println("letter = " + letter);


    }

    public static void digitAndLetterArr(String[] arr) {

        List<String> letterList = new ArrayList<>();
        List<Integer> digitList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j))) {
                    count++;
                }
                if (count == arr[i].length()) {
                    letterList.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isDigit(arr[i].charAt(j))) {
                    count++;
                }
                if (count == arr[i].length()) {
                    digitList.add(Integer.parseInt(arr[i]));
                }
            }
        }


    }

}
