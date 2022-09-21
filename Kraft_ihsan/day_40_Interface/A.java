package day_40_Interface;

public interface A {

    int number=5;//default olarak final degerdir.

    void M1();//default olarak abstact bir metottur.
    void M2();
    void M3();
    void M4();

    default void M5(){

    }
    static void M6(){

    }

}
