package day_46_Exception;

public class CheckedAndUncheckedExecptions {
    public static void main(String[] args) {

        System.out.println("merhaba");
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("dünya");

    }
}
