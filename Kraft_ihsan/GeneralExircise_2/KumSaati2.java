package GeneralExircise_2;

public class KumSaati2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            if(i==7) {

                for (int j = 1; j < 7; j++) {
                    for (int r = 1; r < 7-j; r++) {
                        System.out.print(" ");
                    }
                for (int k = 7-j; k < 8; k++) {
                        System.out.print(k + " ");
                    }System.out.println();
            }

                }
            }
        }
    }

