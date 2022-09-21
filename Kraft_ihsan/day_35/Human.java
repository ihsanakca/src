package day_35;

public class Human {

    public void name(){
        System.out.println("İsmi Ahmet olabilir.");
    }
}
class Man extends Human{
    public void role(){
        System.out.println("Baba olurlar.");
    }

}
class Son extends Man{
    public void activity(){
        System.out.println("Oyun oynar.");
    }
}
class Test{
    public static void main(String[] args) {
        Son son=new Son();
        son.role();
        son.name();
        son.activity();
        System.out.println("--------------------");
        Man man=new Man();
        man.role();
        man.name();
 //       man.activity();//erişemez...
        System.out.println("---------------------");
        Human human=new Human();
        human.name();//sadece kendi metoduna erişebilir..
    }
}