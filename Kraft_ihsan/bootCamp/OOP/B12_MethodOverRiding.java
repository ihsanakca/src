package bootCamp.OOP;

public class B12_MethodOverRiding {
    //sadece inheritance ilişkisi olan subClass ta olabilir.
    //method name, return type ve parametreler aynı olmaz zorunda
    //access modifier ya aynı olacak ya da daha geniş olacak.
    //private ve final ve static metotlarda override yapılamaz.

    //bir metodun birden çok kullanımına izin verir ve faydası budur. ustten gelen altta değiştirilip kullanılması.

    public void method(){
        System.out.println("from parent");
    }
//    static void method(){}
//    private void method(){}
//    final void method(){}
}


class B extends B12_MethodOverRiding{
    @Override
    public void method() {
        System.out.println("from child");
    }
}
class test7{
    public static void main(String[] args) {
        B b =new B();
        b.method();

        B12_MethodOverRiding c=new B12_MethodOverRiding();
        c.method();
    }
}