package bootCamp.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class B16_Polymorphism {

    //poly morph-----çoklu form
    //it is the ability of an object that takes many form/nesnenin birden fazla form alma yeteneği
    //there must be "is a" realitionship
    //parent/super class or interface referenced to child class object
    //nesne hangi classtan üretimişse oranın metodu çalışır.Eşitliğin sağ tarafı yani...
    //referans olan tarafın override edilmemiş metodlarına childdan erişebilmek için downcastin yapılması gerekir.
    //aşağıda örneği var.

    //statik ve dinamik olmak üzere iki çeşit polymorphism vardır.
    //statik polymorphism ---compile time polymorphism -method overloading
    //dynamic polymorphism---- run time polymorphism-method overriding

    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet=(NavigableSet)new TreeSet<>();//polymorphic way
        TreeSet<Integer> treeSet=new TreeSet<>();//normal way
        // referance type casting
        //upcasting-auto casting---kendiliğinden--küçük olanın büyük olana cast olmasıdır.otomatik yapılır java tarafından.

        List<Integer> list=(List) new ArrayList<>();//upcasting

        //downcasting

        Parent_A p1=new Child_A();
        p1.message();
        ((Child_A) p1).message2();

    }


}

class Parent_A{
    void message(){
        System.out.println("message from Parent_A");
    }
}
class Child_A extends Parent_A{
    @Override
    void message() {
        System.out.println("message from Child_A");
    }
    void message2() {
        System.out.println("message2 from Child_A");
    }
}