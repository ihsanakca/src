package GeneralExircise_2;

public class KumSaati {
    public static void main(String[] args) {

            for (int i = 1; i < 8; i++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j < 8; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for (int m = 2; m < 8; m++) {
                for (int t = 0; t < 8 - m; t++) {
                    System.out.print(" ");
                }
//                System.out.print(" ");
                for (int l = 8 - m; l < 8; l++) {
                    System.out.print(l + " ");

                }

                System.out.println();
            }
        }
    }

