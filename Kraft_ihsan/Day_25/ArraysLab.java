package Day_25;

import java.util.Arrays;

public class ArraysLab {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 3, -6, 3};

//        System.out.println(ardArdaUc(numbers));

//        System.out.println(Arrays.toString(lonelyNums(numbers)));

        String str = "Adalet Bakanlığı görüşünde yer alan: “Mahkemece söz konusu" +
                " tanık beyanları dışında gerekçeli kararda yer verilen diğer delillerle " +
                "başvurucu hakkında mahkûmiyet hükmü kurulmuştur.” cümlesinden üstü kapalı " +
                "olarak söz konusu tanık beyanlarının hukuki olmadığının kabulü sonucu çıkmaktadır. " +
                "Ayrıca bakanlık mahkeme heyetinin niyetini de tespit ederek hükmün t" +
                "anık beyanları ile değil diğer delillere dayanarak verildiğini iddia etmektedir. " +
                "Halbuki gerekçeli kararda tanığın beyanlarından bahsedilmesi mahkemenin hüküm kurarken " +
                "beyanları da dikkate aldığını göstermektedir. Bu husus itibariyle tanık beyanlarının " +
                "hukuka uygun olarak alınması gerektiği sonucu ortaya çıkmaktadır. Mahkeme gerekçeli " +
                "kararında hakkımdaki hükmünü hangi hususu dikkate alarak verdiğini belirtmediğinden, Bakanlığın" +
                " bu konudaki değerlendirmeleri somut bir gerçeğe dayanmamaktadır.";

//        System.out.println(mostRepeatedLetter(str,'k'));
//        System.out.println(mostRepeatedLetter_2(str,"e"));
//        System.out.println(mostRepeatedLetter_3(str,"m"));
//        System.out.println(dublicateWord(str));
        int nums []={12,2,36,6,3,8,-1};
        System.out.println(Arrays.toString(fillWithSmallest(nums)));
        System.out.println(Arrays.toString(fillWithSmallest_2(nums)));
        System.out.println(Arrays.toString(fillWithSmallest_3(nums)));
    }

    public static boolean ardArdaUc(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static String[] lonelyNums(int[] arr) {
        String result = "";
        if (arr.length == 0) return result.split("");
        if (arr.length == 1) {
            result += arr[0];
            return result.split("");
        }

        if (arr[0] != arr[1]) {
            result += arr[0] + " ";
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                result += arr[i] + " ";
            }
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            result += arr[arr.length - 1] + " ";
        }

        String[] resultArr = result.split(" ");

        return resultArr;
    }

    public static int mostRepeatedLetter(String s, char harf) {
        s = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == harf) {
                count++;
            }
        }
        return count;
    }

    public static int mostRepeatedLetter_2(String s, String harf) {
        return s.replaceAll("[^A-Za-z]", "").toLowerCase().length() -
                s.replaceAll("[^A-Za-z]", "").toLowerCase().replaceAll(harf, "").length();
    }

    public static int mostRepeatedLetter_3(String s, String harf) {
        return s.replaceAll("[^A-Za-z]", "").toLowerCase().split(harf).length - 1;
    }

    public static boolean dublicateWord(String str) {

        String[] s = str.toLowerCase().split(" ");

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i != j && s[i].equals(s[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] fillWithSmallest(int[] arr) {
        if (arr.length<1) return null;
        int min = arr[0];
        int[] result = new int[arr.length];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        result[0] = min;
        return result;
    }

    public static int[] fillWithSmallest_2(int arr []){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        for (int i=1;i< clone.length;i++){
            clone[i]=0;
        }
        return clone;
    }
    public static int[] fillWithSmallest_3(int arr []){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Arrays.fill(clone,1,clone.length,0);
        return clone;
    }


}
