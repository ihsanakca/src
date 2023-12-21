package GeneralExircise_2;

public class TriangleWithStars3 {
    public static void main(String[] args) {
        int n = 5; // Satır sayısı

        for (int i = 1; i <= 2 * n - 1; i++) {
            int yildizSayisi = i <= n ? i : 2 * n - i;

            for (int j = 1; j <= yildizSayisi; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
