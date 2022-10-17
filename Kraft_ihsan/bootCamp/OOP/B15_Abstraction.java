package bootCamp.OOP;

public class B15_Abstraction {
    //hiding implemention
    //focusing esential , ignore details

    //important point at abstraction is existing of abstract method.
    //abstract methods dont have body so implemention is not allowed
    //abstract metod private olamaz final olamaz stattic olamaz

    //abstraction iki yolu vardır.
    //1-abstarct class
    //abstarct class final olamaz
    //abstarct classtan nesne üretilemez. no object. ama normal herşeye sahip olabilirler.
    // normal metod veya değişkene sahip olabilirler..

    //2-interface
    //blueprint of class..
    //provide addinitional methods. polymorpism ile ilave metod kullanmayı sağlıyor.
    //bunlar class değildir. pure abstarctiondırlar.
    //nesne üretilemez..
    //keyword:implement ile bağlanıyor.
    //birden fazla parenta müsaade ediyor. multiple inheritance..
    //tek tip variable sahip olabiliyor.
}
abstract class Vehicle{
    abstract double price();
}
class Car extends Vehicle implements I{
    @Override
    double price() {
        return 0;
    }

    @Override
    public void test() {

    }
}
interface I{

    public static final String name="Ahmet";//default olarak public static ve finaldırlar.
    public abstract void test(); //default olarak public ve abstarcttırlar..ama methodlarda
                                  // farklı şeyler sonradan javaya eklenmiş..
    default void test2(){};
    static void test3(){};
    //private void test4(){};//normalde oluyor ama benim java bunu kapsamıyor galiba...

}
