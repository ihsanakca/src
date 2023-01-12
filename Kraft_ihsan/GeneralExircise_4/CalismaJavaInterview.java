package GeneralExircise_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalismaJavaInterview {

    public static void main(String[] args) {
       StringBuilder str=new StringBuilder("Ahmet");
       str.reverse();
        System.out.println("str = " + str);
        str.replace(0,3,"qqq");
        System.out.println("str = " + str);

        StringBuffer str2=new StringBuffer("Mehmet");
        str2.reverse();
        System.out.println("str2 = " + str2);
        str.append("ahmet");

        String str5="ali";
        System.out.println(str5);
        new StringBuffer((new StringBuffer("Ahmet").reverse().toString())).toString();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println("list= " + (list instanceof List<Integer>));
        System.out.println("listArr= " + (list instanceof ArrayList<Integer>));


//
//        String str3="Mehmet";
//        String repeat = str3.repeat(2);
//        System.out.println("repeat = " + repeat);
//
//        System.out.println("str.append(str2).append(repeat) = " + str.append(str2).append(repeat));
//        System.out.println("str3.concat(str.toString()).concat(repeat) = " + str3.concat(str.toString()).concat(repeat));
//
//        System.out.println("str2.toString().concat(str3) = " + str2.toString().concat(str3));
//
//        //stars();
//        for (int i = 0; i <10 ; i++) {
//            System.out.println("generateStr() = " + generateStr());
//        }
//
//    }
//    public static void stars(){
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 5-i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
    }
public static String generateStr(){
    Random rand = new Random();
    int length = rand.nextInt(9) + 8;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < length; i++) {
        int ascii = rand.nextInt(75) + 48;
        char c;
        if (ascii >= 48 && ascii <= 57) {
            c = (char) ascii;
        } else if (ascii >= 65 && ascii <= 90) {
            c = (char) ascii;
        } else if (ascii >= 97 && ascii <= 122) {
            c = (char) ascii;
        } else {
            continue;
        }
        stringBuilder.append(c);
    }
    String s = stringBuilder.toString();
    return s;

}
}
