package bootCamp;

public class B9_ObjectAndClass {

    //class is template pf object------What properties and behavior the object have?
    //class bir şablondur, nesnenin şablonudur.------nesneye ait davranış ve özellikler classdan gelir.

    //object :comes from class-----instance of class..
    //nesne:sınıftan gelir ve sınıfın bir örneğidir...


    //fields--instance
    String name;

    static String schoolName="KRAFT";

    //hehavior---methods-instance

    void action(){
        System.out.println("action of "+name);
    }
    static void status(){
        System.out.println("student "+schoolName);
    }
}
class test6{
    public static void main(String[] args) {
        B9_ObjectAndClass copy =new B9_ObjectAndClass();
        copy.name="name1";
        copy.action();

        B9_ObjectAndClass copy2 =new B9_ObjectAndClass();
        copy2.name="name2";
        copy2.action();

        //instance vs static
        //instance---belongs to the object--each object has its own copy
        //static ---belongs to class---only one copy for all object

   B9_ObjectAndClass.schoolName="SuperKRAFT";
   B9_ObjectAndClass.status();



    }
}