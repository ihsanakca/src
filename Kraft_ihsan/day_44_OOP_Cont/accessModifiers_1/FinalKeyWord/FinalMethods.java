package day_44_OOP_Cont.accessModifiers_1.FinalKeyWord;

public class FinalMethods {

    String str;
    public final void method(){
        System.out.println("method");
    }
}
class Drived extends FinalMethods{

   // @Override
 //   public void method(){}// final metodlar override olmaz.
}