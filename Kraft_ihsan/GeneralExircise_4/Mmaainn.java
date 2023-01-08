package GeneralExircise_4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mmaainn {
    public static void main(String[] args)  {
       //substringsOfAString("ford");
        //System.out.println("subsOfAString(ford) = " + subsOfAString("ford"));
        //System.out.println(InetAddress.getLocalHost());

//        Runtime rs = Runtime.getRuntime();
//        try {
//            rs.exec("mspaint");
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }



    }
    public static void substringsOfAString(String str){
        System.out.println("Substrings of \""+str+"\" are :-");
        for( int i = 0 ; i < str.length() ; i++ )
        {
            for( int j = 1 ; j <= str.length()-i ; j++ )
            {
                String sub = str.substring(i, i+j);
                System.out.println(sub);
            }
        }
    }
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
}
