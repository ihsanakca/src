package day_35;

public class Truck extends Vehicle{
    int carryingCapacity;

    public void carrying(){
        System.out.println(color+" "+type+" "+carryingCapacity+" yük taşır.");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
