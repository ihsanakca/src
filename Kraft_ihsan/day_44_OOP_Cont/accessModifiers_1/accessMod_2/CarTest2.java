package day_44_OOP_Cont.accessModifiers_1.accessMod_2;
import day_44_OOP_Cont.accessModifiers_1.Car1;
public class CarTest2 {
    public static void main(String[] args) {
        Car1 car1=new Car1();

        // car1.model="Mazda"; //hata verir...
        // car1.engine=1.6; ////hata verir...inheritance yok. import var.
        car1.year=2019;
        // car1.door=4;////hata verir...
    }
}
