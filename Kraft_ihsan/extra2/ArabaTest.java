package extra2;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba=new Araba("mavi","OPEL",102);
//        System.out.println("araba.color.toUpperCase() = " + araba.color.toUpperCase());
//        System.out.println("araba.color = " + araba.color);
        Araba.factory="Munih";

        Araba araba1=new Araba("red","OPEL",122);
        System.out.println("araba1.factory = " + araba1.factory);
        System.out.println("araba.factory = " + araba.factory);


//        Araba araba1=new Araba(araba);
//        System.out.println("araba1.color = " + araba1.color);
//        System.out.println("araba.brand = " + araba.brand);
//        System.out.println("araba.brand.toLowerCase() = " + araba.brand.toLowerCase());
//        System.out.println("araba.brand = " + araba.brand);
//        System.out.println("(araba.hp+100) = " + (araba.hp + 100));
//        araba.hp=103;
//        System.out.println("araba.hp = " + araba.hp);
    }
}
