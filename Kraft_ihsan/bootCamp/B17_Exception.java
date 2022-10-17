package bootCamp;

import java.io.FileWriter;
import java.io.IOException;

public class B17_Exception {

    //checked ve unchecked diye iki tip vardır.

    //checked exception---during compile time-run etmez---düzeltmek gerekir

    //unchecked exception--during run time--try catch bloğu
    public static void main(String[] args) throws IOException {

        int[] arr = {5, 7, 9, 10};

        String str = null;



//            System.out.println(arr[50]);//runtime exception //unchecked exception
 //           FileWriter writer = new FileWriter("");//checked exception --compile  time exception
        try {
            System.out.println(str.length());
        } catch (Exception e) {
           e.printStackTrace();
        }
        finally {
            System.out.println("ben her halükarda çalışırım");
        }
        try {
            int i=50/0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("merhaba");
//            Integer.parseInt("iki");//number format exception
//            int i = 50 / 0;//aritmetic exception

        }

    }
    //final vs finally vs finalize
    //final keyword
    //finally is a block can use with try/catch blocks, always executes/runs
    //finalize :using with unreferanced object.. referansını kaybetmiş garbage /çöpe atılacak metodlar için kullanılır.

