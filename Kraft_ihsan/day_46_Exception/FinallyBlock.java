package day_46_Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("programa giriş yapıldı");
        try{
            System.out.println("try bloğu");
            int x=5/0;
            System.out.println("merhaba");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("catch bloğu");
        }finally {
            System.out.println("finally bloğu");
        }

        System.out.println("program bitti");
    }
}
