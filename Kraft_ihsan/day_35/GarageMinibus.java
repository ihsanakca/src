package day_35;

public class GarageMinibus {
    public static void main(String[] args) {
        Minibus minibus=new Minibus();
        minibus.type="Minibüs";
        minibus.color="Mavi";
        minibus.seat=14;

        minibus.sellPriceWithTax(50000);

        minibus.using();
        minibus.toString();
    }
} class GarageTruck{
    public static void main(String[] args) {
       Truck truck=new Truck();

       truck.carryingCapacity=16000;
       truck.type="Kamyon";
       truck.color="Kırmızı";
       truck.sellPriceWithTax(120000);

       truck.carrying();
       truck.toString();
    }
}
