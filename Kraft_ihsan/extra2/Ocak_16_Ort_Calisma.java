package extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ocak_16_Ort_Calisma {
    public static void main(String[] args) {
        String str="123adf234hk15k3l"; //k15k3l123adf234h
//        seperate(str);
//        System.out.println(seperateDigitLeter(str));

//        System.out.println(subOfString("salt"));
//        System.out.println("reverseStr(str) = " + reverseStr(str));

//        System.out.println("reverseStr2(str) = " + reverseStr2(str));

//        System.out.println("countOfLetter(\"karabacak\") = " + countOfLetter("karabacak Ali"));

        System.out.println("cutAndAdd(\"salatalık\",3) = " + cutAndAdd("yar", -10));

    }
    // 123adf234hk15k3l  -> 123 adf 234 hk 15 k 3 l
    public static void seperate(String str) {

        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+|[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println(list);
    }
    // 1213 adf 234 hk 15 k 3 l
    public static List<String> seperateDigitLeter(String str){
        List<String> resultList=new ArrayList<>();
        String control="";

        char[] chars = str.toCharArray();//'c','d','1','2','1','3','a'....

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                control+=chars[i];
            }
            else{
                if (!control.isEmpty()){
                resultList.add(control);
                control="";}
            }
        }
        if (!control.isEmpty()){
            resultList.add(control);
            control="";
        }
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])){
                control+=chars[i];
            }else{
                if (!control.isEmpty()){
                    resultList.add(control);
                    control="";}
            }
        }
        if (!control.isEmpty()){
            resultList.add(control);
            control="";
        }
        return resultList;
    }
    // //salt->[s, sa, sal, salt, a, al, alt, l, lt, t] //(0,1)//4
    public static List<String>  subOfString(String str){
        List<String > resultList=new ArrayList<>();
        for (int i=0; i<str.length();i++){
            for (int j = 1; j <=str.length()-i ; j++) {
                String sub=str.substring(i,j+i);
                resultList.add(sub);
            }
        }

        return resultList;
    }

    public static String reverseStr(String str){
       StringBuffer sb=new StringBuffer(str);
       sb.reverse();
       str=sb.toString();
        return str;
    }

    public static String reverseStr2(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    ////"karabacak->2k,4a,1r,1b,1c

    public static List<String > countOfLetter(String str){
        List<String> resultList=new ArrayList<>();
        str=str.trim().replaceAll(" ","").toLowerCase();
        String control="";
        int count=0;
        while (!str.isEmpty()){
            control=str.substring(0,1);
            count=str.length()-str.replace(control,"").length();
            resultList.add(count+control);
            count=0;
            str=str.replaceAll(control,"");
        }

        return resultList;
    }
    // karakutu, 4 -> kutukara
    public static String cutAndAdd(String str, int n){
        if (n>str.length()||n<0)return str;
        return str.substring(str.length()-n).concat(str.substring(0,str.length()-n));
    }
}
