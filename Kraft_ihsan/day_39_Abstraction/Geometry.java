package day_39_Abstraction;

public abstract class Geometry {
    String nameOfShape;


    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
    abstract String info();

    String getNameOfShape(){
        return nameOfShape;
    }
}
class Circle extends Geometry{
    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "Name of shape is "+nameOfShape+", Area is "+area();
    }
}
class Square extends Geometry{
    double side;


    public Square(String nameOfShape,double side) {
        super(nameOfShape);
        this.side=side;
    }

    @Override
   public double area() {
        return Math.pow(side,2);

    }

    @Override
    public String info() {
        return "Name of shape is "+nameOfShape+", Area is "+area();
    }
}