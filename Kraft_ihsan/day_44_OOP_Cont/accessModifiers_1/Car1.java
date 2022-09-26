package day_44_OOP_Cont.accessModifiers_1;

public class Car1 {

    String model;
    public int year;
    private int door;
    protected double engine;

    void method1(){}
    public void method2(){}
    private void method3(){}
    protected void method4(){}

    @Override//object classtan alıyor bunu...
    public String toString() {
        return "Car1{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    public Car1() {
    }

    public Car1(String model, int year, int door, double engine) {
       super();//her class object classına extend oldugundan bu super keywordu hata vermez..
        this.model = model;
        this.year = year;
        this.door = door;
        this.engine = engine;
    }
}
