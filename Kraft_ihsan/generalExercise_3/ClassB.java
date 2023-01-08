package generalExercise_3;

public class ClassB extends ClassA{
    public int b = 100;

   public   ClassB() {
        System.out.println("\"B cons\" = " + "B cons");
    }
    static {
        System.out.println("\"static B\" = " + "static B");
    }
    {
        System.out.println("\"instance B\" = " + "instance B");
    }


    public void methodA() {
        b = b * 5;
        System.out.println("b = " + b);

    }
    public int maxThree(int x, int y, int z){
       return (x>y)&(x>z)?x:y>z?y:z;
    }

}
