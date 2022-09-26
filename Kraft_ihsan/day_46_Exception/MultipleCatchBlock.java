package day_46_Exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        //int[] arr=new int[5];
        System.out.println("program başladı");
        try{
            System.out.println(5/0);
            //System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException yakalandı");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("exception yakalandı");
            System.out.println(e.getMessage());
            //System.exit(0);//programdab çıkmak için...
        }finally {
            System.out.println("finally bloğu çalıştı");
        }
        System.out.println("program sonlandı");

        /*try {
            System.out.println(5/0);
        }catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("exception yakalandı");
        }finally {
            System.out.println("finally bloğu çalıştı");
        }*/

        try {
            System.out.println(5/0);
        }finally {
            System.out.println("finally bloğu çalıştı"); //burası herhalukarda çalışır.
        }
        System.out.println("program sonlandı");
    }
}
