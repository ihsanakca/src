package extra2;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba=new Araba("mavi","opel");
        Araba araba1=new Araba(araba);
        System.out.println("araba1.brand = " + araba1.brand);
        System.out.println("araba.brand = " + araba.brand);
    }
}
