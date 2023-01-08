package GeneralExircise_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Number_1 {
    public static void main(String[] args) {

//        String[] stringList = {"10", " ", "33", "kartalkara"};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = {98, 10, 112, 122, 13, 14, 155, 16};
//        printStringCount(stringList);
//      System.out.println(thirdBiggest(arr));

//        System.out.println("fibonacci(18) = " + fibonacci(18));
//        fibonacci2(18);

//        System.out.println(Arrays.toString(reverseArr(arr)));
//        System.out.println(Arrays.toString(mergeArrays(arr, arr1)));
//        System.out.println(Arrays.toString(mergeArrays2(arr, arr1)));

//        String str = "Adanada Adanalıyım denmez";
//        duplicateChars(str);

//        triangelNumbers();

//        primeNumbers(325);
//        System.out.println("sumOfBigTwo(arr1) = " + sumOfBigTwo(arr1));

//        String   str = "123AM256CD";
//        intString(str);

//        numbers(0);

//        System.out.println(powerOfNums(3, 4));

//        printNumbers(0);
       numbers(0,100);

        System.out.println(rastgeleBirHarfver());
    }


    public static void printStringCount(String[] stringArr) {
        int numericStringCount = 0;
        int nonNumericStringCount = 0;
        int control = 0;

        for (int j = 0; j < stringArr.length; j++) {
            if (stringArr[j].length() == 0 || stringArr[j].replaceAll(" ", "").length() == 0) continue;
            for (int i = 0; i < stringArr[j].length(); i++) {

                if (Character.isDigit(stringArr[j].charAt(i))) control++;
            }
            if (control == stringArr[j].length()) {
                numericStringCount++;
            }
            if (control == 0) {
                nonNumericStringCount++;
            }
            control = 0;
        }
        System.out.println("Number of numeric strings: " + numericStringCount);
        System.out.println("Number of non-numeric strings: " + nonNumericStringCount);
    }
    //The method should process this array and return the 3rd largest number in the array.
    // For example, if the array contains the numbers {10, 2, 5, 4, 6, 17, 11, 22}
    // then the method should print the number 11 and also return the same.

    public static int thirdBiggest(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 3];
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(0);
        resultList.add(1);
        for (int i = 0; i < n; i++) {
            resultList.add(resultList.get(i) + resultList.get(i + 1));
        }
        return resultList;
    }

    public static void fibonacci2(int n) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static int[] reverseArr(int[] arr) {
        int resultArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[(arr.length - 1) - i];
        }
        return resultArr;
    }

    public static int[] mergeArrays(int[] arr, int[] arr1) {
        int resultArr[] = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        for (int i = arr.length, j = 0; i < resultArr.length; i++, j++) {
            resultArr[i] = arr1[j];
        }
        return resultArr;
    }

    public static int[] mergeArrays2(int[] arr, int[] arr1) {
        int resultArr[] = new int[arr.length + arr1.length];
        System.arraycopy(arr, 0, resultArr, 0, arr.length);
        System.arraycopy(arr1, 0, resultArr, arr.length, arr1.length);
        return resultArr;
    }

    //Java program to find duplicate characters from word without using for loops.

    public static void duplicateChars(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        if (str.length() != 0) {
            String control = str.substring(0, 1);
            str = str.substring(1);
            if (str.contains(control)) {
                System.out.print(control + " ");
                str = str.replaceAll(control, "");
            }
            duplicateChars(str);
        }
    }
    //1
    //3 3
    //5 5 5
    //7 7 7 7

    public static void triangelNumbers() {
        for (int i = 1; i < 8; ) {
            for (int j = 0; j < i - j; j++) {
                System.out.print(i);
            }
            i += 2;
            System.out.println();

        }
    }

    public static void primeNumbers(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(1);
        primeList.add(2);
        ihsan:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue ihsan;
            }
            primeList.add(i);
        }
        System.out.println(primeList);
    }

    public static int sumOfBigTwo(int arr[]) {
        int control = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    control = arr[i];
                    arr[i] = arr[j];
                    arr[j] = control;
                }
            }
        }
        return arr[arr.length - 1] + arr[arr.length - 2];
    }

    public static void intString(String str) {
        String letters = "", digits = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else {
                letters += str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

    }

    public static void numbers(int from,int to) {
        System.out.print(from + " ");
        if (from < to) {
            //from+=2;
            from++;
            numbers(from,to);

        } else {
            System.out.println("done...!");
        }

    }

    public static void printNumbers(int n) {
        System.out.print(n+" ");
        if (n < 100) {
            printNumbers(n + 1);
        }
    }


    public static int powerOfNums(int number, int power) {
        if (power == 0) return 1;
        int result = 1;
        while (power > 0) {
            result *= number;
            power--;
        }
        return result;
    }

    public static String rastgeleBirHarfver(){
        String alfabe="ABCÇDEFGĞHİIJKLMNOÖPRSŞTUÜVYZabcçdefgğhiıjklmnoöprsştuüvyz";
        int maxIndex=alfabe.length()-1;
        int rastgeleIndex= (int) (Math.random()*maxIndex);
        Random rd=new Random();
        int index=rd.nextInt(maxIndex);
        return alfabe.substring(index,index+1);
    }

    public static void triangle(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}






