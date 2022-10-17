package bootCamp;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class B1_DataTypes_Wrapper {
    public static void main(String[] args) {
        int a=100;
        double dl=a;//implicit casting/kapalı
//        System.out.println("dl = " + dl);

        double d=100.0;
        int i= (int) d; //explicit casting/açık

        //------------------------------------

//        **Wrapper Class**
//        System.out.println("Integer.max(23,3) = " + Integer.max(23, 3));
//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//
//        Scanner scan=new Scanner(System.in);
//        int num1= scan.nextInt();
//        int num2= scan.nextInt();
//
//        for (int j = Integer.min(num1,num2); j <=Integer.max(num1,num2) ; j++) {
//            System.out.print(j+" ");
//
//        }

       // parseInt string digiti integere çeviriyor. primitive integere çeviriyor.

        String str="23";
        Integer z=Integer.parseInt(str);
//        System.out.println("z = " + z);

         int z1=Integer.parseInt("5");
//        System.out.println("z1 = " + z1);

        // * valueOf stringi convert ediyor. dijitten oluşmuş olması lazım.Wrapper class objectine dönüştürüyor.

        int k=Integer.valueOf("5");//metot çağırabilir..
        int k1=Integer.parseInt("5");//metot çağırılamaz..

        //------------------------

//        System.out.println("Character.isDigit('5') = " + Character.isDigit('5'));//true
//
//        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
//        System.out.println("Character.isLetterOrDigit('5')+\"----\"+Character.isLetterOrDigit('b') = "
//                + Character.isLetterOrDigit('5') + "----" + Character.isLetterOrDigit('b'));

        String dateEncrypted= "1&%//()2&&&/()=)=/&M+^+^^+a&&///(y////ı^^''^'^s++%%&&2^^+0'''^^++%%%%&&&22";

        String dateDecrypted="";

        for (int j = 0; j < dateEncrypted.length(); j++) {
            if(Character.isLetterOrDigit(dateEncrypted.charAt(j))){
                dateDecrypted+=dateEncrypted.charAt(j);
            }

        }
        System.out.println("dateDecrypted = " + dateDecrypted);
    }
}
