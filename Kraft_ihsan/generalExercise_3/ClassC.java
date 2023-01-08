package generalExercise_3;

public class ClassC extends ClassB{
    public int c =10;

    public ClassC() {
        System.out.println("\"C cons\" = " + "C cons");
    }
    static {
        System.out.println("\"static C\" = " + "static C");
    }
    {
        System.out.println("\"instance C\" = " + "instance C");

    }

    public void methodC(){
        c =11* c;
        System.out.println("c = " + c);
        super.methodA();

    }
}
class mainTest{
    public static void main(String[] args) {
        ClassC c=new ClassC();

        //c.methodA();
        c.methodC();
        System.out.println("c.maxThree(-20,-1,-1) = " + c.maxThree(-20, -1, -1));
    }
}