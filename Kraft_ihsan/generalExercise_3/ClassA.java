package generalExercise_3;

public class ClassA {
    public int a =10;

    public ClassA() {
        System.out.println("\"A cons\" = " + "A cons");
    }
    static {
        System.out.println("\"static A\" = " + "static A");
    }
    {
        System.out.println("\"instance A\" = " + "instance A");
    }

    public void methodA(){
        a =9* a;
        System.out.println("a = " + a);
    }
}
