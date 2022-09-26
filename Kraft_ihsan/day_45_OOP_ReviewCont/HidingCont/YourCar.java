package day_45_OOP_ReviewCont.HidingCont;

public class YourCar extends MyCar {
    public static boolean haveSunroof() {
        return true;
    }

    public void geYourSunroofStatus(){
        System.out.println("Your car has sunroof :"+haveSunroof());

    }
}