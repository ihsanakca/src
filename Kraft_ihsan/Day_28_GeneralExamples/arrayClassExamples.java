package Day_28_GeneralExamples;

public class arrayClassExamples {
    public static void main(String[] args) {
int[] sayilar={0,1,2,3,8,9,11,23,29};
        System.out.println(asalSayiBul(sayilar));
    }
//Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
//[21,7,29,12] ----→ 7 29
    public static  String  asalSayiBul(int [] arr){
        String result="";
        firstLoop:for (int sayi:arr) {
            if(sayi==2) {result+=sayi+" ";}
            else if (sayi==0||sayi==1) {continue firstLoop;

            }else{
                for (int i = 2; i < sayi; i++) {
                    if (sayi%i==0){
                        continue firstLoop;
                    }

                }result+=sayi+" ";
            }
        }return result;
    }
}
