package day_38_finalAndHidding;

public class Parent {
    protected int num;
    static int x=0;
    {x++;
        System.out.println("instance metod çalıştı.");
    }
    static {
        System.out.println("static metod çalıştı.");
    }
    Parent(){
        System.out.println("constructor çalıştı.");
    }
}
