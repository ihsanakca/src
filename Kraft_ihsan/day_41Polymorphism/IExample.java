package day_41Polymorphism;

public interface IExample {
    default void baslat(){
        mesaj();
    }
    default void mesaj(){      //java 9 dan itibaren bu metot private olabilir. ama bu versionda hata veriyor.
        System.out.println("merhaba dunya");
    }
}
class Main implements IExample{
    public static void main(String[] args) {
        Main main=new Main();
        main.baslat();

    }
}