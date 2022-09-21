package day_42_OOP_Review;

public class Daire {
   private final static double PI=3.14;
    private double radius;
  static   {
      System.out.println("static blok bir defa çalışır.");

  }
    {
        System.out.println("instant blok her obje oluştuğunda bir defa çalışır.");
    }

    public Daire(){}
     Daire(int radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        if(!(radius<=0)){
            this.radius=radius;
        }else{
            System.out.println("Yarı Çap 0 ve 0 dan kucuk olamaz.");
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double alan(){
        return PI*Math.pow(radius,2);
    }

    public double cevre(){
        return 2*PI*this.radius;
    }

    public static double alan(double radius){
        return PI*Math.pow(radius,2);

    }

    public static double cevre(double radius){
        return 2*PI*radius;
    }
}
