package day_44_OOP_Cont.accessModifiers_1.FinalKeyWord.Hiding;

public class TestSuperAndSub {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println("before increment " + sub.i);
        sub.increment();
        System.out.println("after increment " + sub.i);
        System.out.println("--------------------");
        Super spr=new Super();
        System.out.println("before increment " + spr.i);
        spr.increment();
        System.out.println("after increment " + spr.i);
        System.out.println("-------------");



    }
}
