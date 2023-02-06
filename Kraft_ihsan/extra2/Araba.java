package extra2;

public class Araba {
    public static String factory;
    String color;
    String brand;
    int hp;
    Araba(String color,String brand,int hp){
        this.color=color;
        this.brand=brand;
        this.hp=hp;
    }
    Araba(Araba objOfAraba){
        this.color = objOfAraba.color;
        this.brand = objOfAraba.brand;
    }
}

