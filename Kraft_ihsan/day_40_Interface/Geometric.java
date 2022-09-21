package day_40_Interface;

public interface Geometric {
    int exponential=2;
    double PI=3.14;
    double getArea(double expo);

    default double getPerimeter(double...sides){
        double perimeter=0;
        for (double side:sides) {
        perimeter+=side;
        }
        return perimeter;
    }
    static double getExponential(double d){
        return exponential+d;
    }
}
class Square implements Geometric{
    double a;

    public Square(double a) {
        this.a = a;
        System.out.println("Area : "+getArea(Geometric.exponential));
        System.out.println("Perimeter : "+getPerimeter(this.a,this.a,this.a,this.a));
    }

    @Override
    public double getArea(double expo) {
        return Math.pow(a,expo);
    }
}
class run {
    public static void main(String[] args) {
        Square square1=new Square(3);
      //  System.out.println("Area() = " + square1.getArea());
       // System.out.println("Perimeter = " + square1.getPerimeter(2, 2, 2, 2));
    Circle circle1=new Circle(3);
    circle1.getArea(Geometric.exponential);


    }
}