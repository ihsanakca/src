package day_45_OOP_ReviewCont.HidingCont.Interface;

public interface A {
   // int i;//instance variable olmaz
   public static final int i=10;//public static final olabilir sadece
                       int j=20;
   public abstract void M1();  //public abstract olabilir sadece..
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();


    default void M5(){}//tum alt sınıfları kolayca etkilemek icin default metot kullanımına ızın verilmiş.esneklik kazandırıyor.
    //geriye donuk uyumluluk saglıyor.
    static void M6(){}
   // private void M4(){}// java 8 den sonra bu hata vermiyor.
}
