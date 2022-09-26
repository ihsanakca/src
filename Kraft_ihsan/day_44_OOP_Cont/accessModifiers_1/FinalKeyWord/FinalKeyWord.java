package day_44_OOP_Cont.accessModifiers_1.FinalKeyWord;

public class FinalKeyWord {

    static final int f=10;
    final int n;
    final int l;
    static final int sl;

    public FinalKeyWord(){
        n=20;
        System.out.println("from costructor " + n);
    }
    {
        l=30;
        System.out.println("from init block " + l);
    }
    static {
        sl=40;
        System.out.println("static blok run");
    }

}
class run{
    public static void main(String[] args) {

        FinalKeyWord finalKeyWord=new FinalKeyWord();
        System.out.println("----------------------");
        FinalKeyWord finalKeyWord1=new FinalKeyWord();


    }
}
