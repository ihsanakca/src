package GeneralExircise_2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exception_Array {
    public static void main(String[] args) throws Exception {

        int [] intArr={17,3,5,6,2,8,78,56,88,23};
        //System.out.println(maxArrayIndex(intArr));
        //System.out.println(Arrays.toString(maxminArray(intArr)));
        //System.out.println(maxArray(intArr));
        System.out.println(mapOfArray(intArr));


    }
    // array tanımlayalım içerisinde en buyuk sayının indeks numarasını getiren metodu yazınız
    // en buyuk sayıdan iki veya daha fazla var ise bir new exception throw edin.

    public static int maxArrayIndex(int [] arr) throws Exception {
        int newArr[]=new int[arr.length];
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        Arrays.sort(newArr);
        if(newArr[newArr.length-1]==newArr[newArr.length-2]){
            throw new Exception("maximum sayıdan iki adet vardır.");
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==newArr[newArr.length-1]) {
               maxIndex=i;
           }
        }
        return maxIndex;
    }

    public static int[] maxminArray(int [] arr){
        Arrays.sort(arr);
        int[] maxminArr={arr[0],arr[arr.length-1]} ;
        return maxminArr;
    }

    public static int maxArray(int []arr){
        int maxOfArray=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxOfArray){
                maxOfArray=arr[i];
            }
        }
        return maxOfArray;
    }
    public static Map<Integer,Integer> mapOfArray(int [] arr) throws Exception {

        Map<Integer,Integer> mapArr=new TreeMap<>();
        for (int i = 0; i <arr.length ; i+=2) {
            if(arr.length%2==1){
                throw new ArrayIndexOutOfBoundsException("Arrayin boyu tek olamaz");
            }
            mapArr.put(arr[i],arr[i+1]);

        }
        return mapArr;
    }


}
