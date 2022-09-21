package day_41Polymorphism;

public class Main_Polymorphinsm {
    public static void main(String[] args) {
        /*SportCar kırmızıMelek=new SportCar();
        kırmızıMelek.start();

        Car beyazMelek=new SportCar();
        System.out.println(beyazMelek.durmaMesafesi());
        beyazMelek.start();

        IVehicle sariMelek=new SportCar();
        sariMelek.start();
        sariMelek.stop();

        System.out.println(sariMelek.getClass());

        Kus limon=new Kanarya();
        Kus mavis=new Muhabbet();



        System.out.println(limon instanceof Kus);
        System.out.println(mavis instanceof Kus);
        System.out.println(mavis instanceof Muhabbet);
        System.out.println(mavis instanceof Kanarya);

        if (limon instanceof Kus){      //kanarya da olur...muhabbet olursa false olur..
            System.out.println("limon kanaryanın örneğidir");
        }*/

        Kus kus=new Kanarya();
        Kanarya kanarya=(Kanarya) kus; //casting

    }
}
