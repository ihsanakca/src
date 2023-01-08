package day_34_staticVariable.staticMethods;

public class Geometric_2 {
    static int perimeter;


    public static void setPerimeter(int... sides){
        perimeter=0;
        for (int i:sides ) {
            perimeter+=i;
        }
        System.out.println("geometrik şeklin çevresi "+perimeter);

    }
}
class Main3 {
    public static void main(String[] args) {
        Geometric_2.setPerimeter(2,3);
        Geometric_2.setPerimeter(2,3,5);
    }

}
