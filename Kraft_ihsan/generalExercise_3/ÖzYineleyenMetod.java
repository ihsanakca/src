package generalExercise_3;

public class ÖzYineleyenMetod {
    public static void main(String[] args) {
//        geriSayım(14);
//        geriSayım2(15);
        String str = "arabacı arabayı getir.";
        reverseWord(str);


    }

    public static void geriSayım(int n) {
        if (n > 0) {
            System.out.println(n);
            n--;
            geriSayım(n);
        } else {
            System.out.println("Done!!");
        }
    }

    public static void geriSayım2(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
            if (i == 1) System.out.println("Done!!");
        }
    }

    public static void reverseWord(String str) {
        String control="";
        control+= str.substring(0,1);
        str = str.replaceFirst(str.substring(0,1), "");
        if (str.length()>0) {
            reverseWord(str);
        }
        System.out.print(control);

    }

}
