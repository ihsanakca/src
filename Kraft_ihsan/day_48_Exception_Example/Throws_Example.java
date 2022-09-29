package day_48_Exception_Example;

public class Throws_Example {
    public static void main(String[] args) throws KraftException {
        throw new KraftException("Exception atıldı");
//aMetodu();
    }
    public static void aMetodu(){
bMetodu();
    }
    public static void bMetodu(){
        try{cMetodu();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void cMetodu() throws InterruptedException {
dMetodu();
    }
    public static void dMetodu() throws InterruptedException {
         Thread.sleep(3000);
    }


}
