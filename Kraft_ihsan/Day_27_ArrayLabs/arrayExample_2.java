package Day_27_ArrayLabs;

import java.util.Arrays;

public class arrayExample_2 {
    public static void main(String[] args) {
        int[] sayilar = {35, 665, 69, 5,8,78,36,6};
        //System.out.println(ardArdaThree(sayilar));
        //System.out.println(Arrays.toString(yanlizSayilar(sayilar)));
        //System.out.println(enCokSayi(sayilar));
        //System.out.println(dublicateSayi(sayilar));
        String str="Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek \n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp \n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının \n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o \n" +
                "harfi vardır. (Büyük ve küçük ihmal edilecek) ";
       // System.out.println(kacAdetOHarf(str, "o"));
String str3="araba yolda kaldı.";
        //System.out.println(sameWord(str3));

        //System.out.println(Arrays.toString(enKucukAtaGerisiSifir(sayilar)));

        System.out.println(Arrays.toString(degerAtamaKontrol(sayilar, 36, 6, 11)));
    }
//Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.

    public static boolean ardArdaThree(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return true;
            }

        }
        return false;
    }
//Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
//yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)

    public static String[] yanlizSayilar(int[] arr) {
        String yanlizSayilar = "";
        if (arr.length == 1) {
            yanlizSayilar += arr[0] + " ";
            return yanlizSayilar.split(" ");
        }
        if (arr[0] != arr[1]) yanlizSayilar += arr[0] + " ";
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                yanlizSayilar += arr[i] + " ";

        }
        if (arr[arr.length - 1] != arr[arr.length - 2])
            yanlizSayilar += arr[arr.length - 1] + " ";
        return yanlizSayilar.split(" ");
    }

//Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
//birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)

    public static int enCokSayi(int[] arr) {
        if (arr.length == 1) return -1;

        int enCok = -1;
        int count;
        int adet = 1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > adet) {
                enCok = arr[i];
                adet = count;
            }

        }
        return enCok;

    }

//Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
//[1,2,8,1] true
//[25,89,78,98] false

    public static boolean dublicateSayi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) return true;

            }
        }
        return false;
    }
//Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
//dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
//sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
//üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
//harfi vardır. (Büyük ve küçük ihmal edilecek)

public static int kacAdetOHarf (String str, String harf){
        str=str.toLowerCase();
        String[] arr=str.split("");
        int count=0;

    for (String harf_1:arr) {
        if (harf_1.equals(harf))
        count ++;

    }

    return count;
}
//Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
//yazınız.
//araba ile yola çıktık fakat araba arıza yaptı true
//araba ile yola çıktık fakat arıza yaptı false

    public static boolean sameWord(String str){
        String[] strArr=str.toLowerCase().split(" ");
        for (int i = 0; i <strArr.length ; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (i!=j&&strArr[i].equals(strArr[j]))
                    return true;

            }

        } return false;
    }

//Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
//indekslere 0 atayan metodu yazınız.
//[5,7,1,9] [1,0,0,0]

    public static int[] enKucukAtaGerisiSifir(int[] arr){
        int enKucuk=arr[0];
        int [] yeniArr= new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<enKucuk){
                enKucuk=arr[i];
            }
            yeniArr[0]=enKucuk;
            for (int j = 1; j <arr.length ; j++) {
                yeniArr[j]=0;
            }
        }return yeniArr;
    }

//Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
//[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
//[5,7,8,5,9] → [5,7,8,5,9]
    public static int[] degerAtamaKontrol(int [] arr, int ilkDeger, int kontrolDeger, int atanacakSayi){
        int [] yeniArry=new int[arr.length];
        yeniArry[0]=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==ilkDeger&&arr[i+1]==kontrolDeger){
                yeniArry[i+1]=atanacakSayi;
            }else {
                yeniArry[i+1]=arr[i+1];
            }

        }
        return yeniArry;
    }


}
