package bootCamp.OOP;

public class B11_Inheritance {

    // is A relationship between parent and child.
    //keyword:extends-----child/subClass extends super/parentClass
    //subClass bu sayede superClass tan faydalanıyor ama tersi olmuyor.
    //alt classlar tek yere extend olabilirler ama super classlara birden çok farklı alt klass bağlanabilir.

    //kod tekrarını azaltır.
    //sade kod yapısı.
    //kod bakımı kolay oluyor.
    public static void main(String[] args) {
        Child ahmet =new Child();
        Child ayse=new Child("ayse",5);
    }
}
class Parent {
    String name;
    int age;

    public Parent() {
        System.out.println("parent class constructor");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent{
    public Child() {
        super();//compiler put super() keyword automatically and implicit
    }
    // eğer parametreli constructor varsa parent classta biz child classa super() parametreli olarak koymak zorundayız...

    public Child(String name, int age) {
        super(name, age);
    }
    //nesne oluşturduğunda önce parent class constructor çalışır daha sonra child classınki çalışır.
}