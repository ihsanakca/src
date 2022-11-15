package generalExercise_3;

public class Palindrom {
    public static void main(String[] args) {

        String s = "A man, a plan, a ca5656456456%&%+^&//(('^++%%nal: Panama";
        System.out.println(palindrom(s));

    }

    public static boolean palindrom(String str) {
        str = str.replaceAll("[^A-Za-z]", "").toLowerCase();
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        if (reverseStr.equals(str)) {
            return true;
        }
        return false;
    }
}
