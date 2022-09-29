package day_48_Exception_Example;

public class ExceptionExample {
    public static void main(String[] args) {

        int [] arr={1,3,33,32,25,36};
        System.out.println(maxNumberArray(arr));
        System.out.println(maxIndexNumberForArray(arr));

    }
    // array tanımlayalım içerisinde en buyuk sayının indeks numarasını getiren metodu yazınız
    // en buyuk sayıdan iki veya daha fazla var ise bir new exceptin throw edin.

    public static int maxNumberArray(int [] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }

    public static int maxIndexNumberForArray(int [] arr){
        int maxNumber=maxNumberArray(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==maxNumber){
                return i;
            }

        }return 0;
    }





}
