package GeneralExircise_2;

public class TriangleWithStars {
    public static void main(String[] args) {

        setTriangle(5);
        setTriangle2(5);


    }

    public static void setTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int numberOfStars = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void setTriangle2(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int numberOfStars = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
