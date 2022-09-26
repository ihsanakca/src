package day_45_OOP_ReviewCont.HidingCont;

public class MyCar {
    public static boolean haveSunroof(){
        return false;
    }
    public void getMySunroofStatus(){
        System.out.println("My car has sunroof :"+haveSunroof());

    }
}
