package extra2;

public class Araba {
    String color;
    String brand;
    Araba(String color,String brand){
        this.color=color;
        this.brand=brand;
    }
    Araba(Araba ib){
        this.color = ib.color;
        this.brand = ib.brand;
    }
}
