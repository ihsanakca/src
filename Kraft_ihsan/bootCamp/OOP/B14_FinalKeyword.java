package bootCamp.OOP;

public class B14_FinalKeyword {

    //değiştirlemez. metot ve değişkenlerde kullanılır.

    //final variable 3 yerde ilk değeri verilir.
    //1. ilk oluşturulduğu yerde
    //2.constructorda tanımlanabilir
    //3.init blockta tanımlanabilir.boş blok yani

    final double PI=3.14;
    final double PI2;
    final double PI3;
    static final double PI4=3.14;
    static final double PI5;

    public B14_FinalKeyword() {
        PI2=3.14;
    }
    {
        PI3=3.14;
    }
    static {
        PI5=3.14;
    }

    //method
    // can not be override

    //class
    //parent/super class olamaz. can not be inherited
    //bu sayede immutable class yapılır. değiştiitlemez class yapısı bu sayede kurulabilir

}
final class A{

}
//class Br extends A{//inherit edemez üsttekini
//
//}