package generalExercise_3;

public class HarfBul {
    public static void main(String[] args) {
        System.out.println(harfBul("252asal+-&%+l77akao&'!0a7798"));
    }

    public static String harfBul(String str) {
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
