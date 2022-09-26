package day_44_OOP_Cont.accessModifiers_1.accessMod_2;

import day_44_OOP_Cont.accessModifiers_1.Car1;

public class Car2 extends Car1 {

    @Override
    public void method2() {
        super.method2();
    }

    @Override
    protected void method4() {
        super.method4();
    }

    public Car2(){
        super();
//        model="Mazda";//hata verir..
        engine=1.6;
        year=2019;
//        door=4;//hata verir...
    }
//private class inner{}//inner class private olabilir..normal class olmaz.

}
