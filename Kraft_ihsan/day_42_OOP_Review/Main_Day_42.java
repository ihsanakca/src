package day_42_OOP_Review;

public class Main_Day_42 {
    public static void main(String[] args) {
Daire daire1=new Daire();
Daire daire2=new Daire(2);
Daire daire3=new Daire();
Daire daire4=new Daire();

changeRadius(daire2,4);
        System.out.println(daire2.getRadius());


    }

    public static void changeRadius(Daire daire, double radius){
        daire.setRadius(radius);
    }
}
