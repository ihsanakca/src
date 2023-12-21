package GeneralExircise_2;

public class TriangleWithStars2 {
    public static void main(String[] args) {
        int n = 5; // Satır sayısı

        // Yukarı doğru olan kısım
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Aşağı doğru olan kısım
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
