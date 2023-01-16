package extra2;

import java.util.ArrayList;
import java.util.List;

public class OrtakCalisma3 {
    public static void main(String[] args) {
        String str="salatalık";
//        System.out.println("seperateDigitAndWord(str) = " + seperateDigitAndWord(str));
//        System.out.println("subsOfAString(str) = " + subsOfAString(str));

        System.out.println("letterCounter(str) = " + letterCounter(str));

    }
    // 1253adf234hk15k38l  -> 1253 adf 234 hk 15 k 38 l
    public static List<String> seperateDigitAndWord(String str) {
        List<String> result = new ArrayList<>();
        String control = "";

        char[] chars = str.toCharArray();//'a','b','5','3','a'

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
    //salt->[s, sa, sal, salt, a, al, alt, l, lt, t]
    public static List<String> subsOfAString(String str){
        List<String> result=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <=str.length()-i ; j++) {
                String sub=str.substring(i,i+j);
                result.add(sub);
            }
        }
        return result;
    }
    //reverse string
    //"karabacak->2k,4a,1r,1b,1c

    public static List<String> letterCounter(String str){
        List<String> result=new ArrayList<>();
        String control;
        int count;
        while(!str.isEmpty()){
            control=str.substring(0,1);
            count=str.length()-str.replace(control,"").length();
            result.add(count+control);
            str=str.replace(control,"");
        }
        return result;
    }
}
