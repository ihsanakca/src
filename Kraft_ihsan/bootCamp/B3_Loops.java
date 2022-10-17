package bootCamp;

import java.util.Scanner;

public class B3_Loops {
    public static void main(String[] args) {

        String message="Welcome to bootcamp";

       String message1="";

       for (int i = message.length()-1; i >=0; i--) {
           //if(message.charAt(i)==' '){break;}
            if(message.charAt(i)!=' ') {
                message1 += message.charAt(i);
            }else {break;}
        }
        System.out.println("message1 = " + message1);

       message="Welcome to bootcamp";

      int i=message.length()-1;
      message1="";

       while(message.charAt(i)!=' '){
           message1+=message.charAt(i);
           i--;
       }
        System.out.println("message1 = " + message1);

       //---------------------------
        String color="red";
        int count=0;

        do {
            count++;
            System.out.println(count+"--->do it");

        }while (color.equals("mavi") && count<10);


        //break and continue
        //kullanıcıdan iki sayı alın
        //1- 7 ye tam bolünen sayıya kadar azalan şekilde yazdırın.
        //2- 7 ye tam bölünenler hariç artan şekilde yazdırın.

       /* Scanner scan=new Scanner(System.in);
        System.out.println("üst ve alt sınırı giriniz: ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        for (int j = Integer.max(num1,num2); j >=Integer.min(num1,num2) ; j--) {
            if(j%7==0)break;
            System.out.print(j+" ");


        }System.out.println();

        for (int t = Integer.min(num1,num2); t <=Integer.max(num1,num2); t++) {
            if((t%7)==0)continue;// true ise devam etme başa dön demek. false ise aşağıya git ve yazdır...
                System.out.print(t+" ");

        }*/

        //label works with break and continue
        // verilen aralıktaki prime numberları bulunuz...

        //1-prime number sadece 1 ve kendine tam olarak bölünen sayılardır.
        //2-her sayı 1 e bölünebilir. bu nedenle loop 2 den başlamalı. 2 den başlayarak sayının kendisine kadar
        //olan tüm sayıları bölüp tam olarak bölünüp bölünmediğine bakılacak.

        //7  ila 14 arası.

        ihsan : for (int j = Integer.min(7,14); j <=Integer.max(7,14) ; j++) {
            for (int k =2 ; k <j ; k++) {
            if(j%k==0){
                 continue ihsan;
            }
            }
            System.out.println(j+" ");
        }





    }
}
