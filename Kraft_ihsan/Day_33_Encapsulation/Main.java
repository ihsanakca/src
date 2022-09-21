package Day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {

       /* Person enes=personCreate("Enes Yılmaz",1211);
        System.out.println("enes.name = " + enes.name);

        personChange(enes,"kamil altınbaş",4063);
        System.out.println("enes.name = " + enes.name);
        System.out.println("enes.id = " + enes.id);


        Person mehmet=personCreate("Mehmet Yılmaz",1212);
        System.out.println("enes.name = " + enes.name);
        System.out.println("mehmet.name = " + mehmet.name);*/

       /* Dog karabas=new Dog("bombom");
        System.out.println( karabas.getName());
        karabas.setName("karabaş");
        System.out.println(karabas.getName());
        karabas.setName("boncuk");
        System.out.println(karabas.getName().substring(0, 3).toUpperCase());

        Dog dog=new Dog("konya");
        dog.setBreed("sivas");
        System.out.println("dog.getName() = " + dog.getName());
        System.out.println("dog.getBreed() = " + dog.getBreed());

        System.out.println("dog.getAge() = " + dog.getAge());
        dog.setAge(15);
        System.out.println("dog.getAge() = " + dog.getAge());

        Circle circle_1=new Circle(5);
        //circle_1.setRadius(12);
        System.out.println(circle_1.getRadius());
        System.out.println(circle_1.circleArea());

        System.out.println(Circle.circleArea(5));

        circle_1.setRadius(10);
        System.out.println(circle_1.getRadius());*/

        KraftBankCustomer enes=new KraftBankCustomer(1254,"Enes Yılmaz", false);
        System.out.println(enes.getCustomerToken());

        enes.setCustomerFullName("1254EN12","Enes Şen");
        System.out.println(enes.getCustomerFullName());

        enes.addMoney(500);
        enes.addMoney(1250);
        System.out.println(enes.getCustomerAccount());

        enes.setIsSMS(true);
        System.out.println(enes.getIsSMS());


    }

public static Person personCreate(String name, int id){
        Person person=new Person(name,id);
        return person;
}

    public static Person personChange(Person person, String name, int id){
       person.name=name;
       person.id=id;
        return person;
    }
}
