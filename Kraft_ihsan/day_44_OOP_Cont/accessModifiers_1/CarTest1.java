package day_44_OOP_Cont.accessModifiers_1;

public class CarTest1 {
    public static void main(String[] args) {

        Car1 car1=new Car1();
        car1.model="Mazda";
        car1.engine=1.6;
        car1.year=2019;
        //car1.door=4; //erisim yok buna

        System.out.println(car1.toString());
        System.out.println(car1);

    }
}
