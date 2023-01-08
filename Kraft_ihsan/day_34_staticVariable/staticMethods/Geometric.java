package day_34_staticVariable.staticMethods;

import java.util.Random;

public class Geometric {
    static int perimeter;
    static int counterSide;

    public static void setPerimeter(int... sides){
        for (int i:sides ) {
            perimeter+=i;
            counterSide++;

        }
        System.out.println("geometrik şeklin çevresi "+perimeter);
        System.out.println("geometrik şeklin kenar sayısı "+counterSide);
    }
}class main2{

    public static void main(String[] args) {

        //Geometric.setPerimeter(2,3);
        Geometric.setPerimeter(generateSide(),generateSide(),generateSide(),generateSide());

       // Geometric.setPerimeter(2,3,5);//bir öncekini hafızada tuttuğu için bunun sonucu 15 oluyor...

        main2.generateSide();
        //System.out.println(generateSide());
    }
    public static int generateSide(){
        Random random=new Random();
        return random.nextInt(10);
    }
}
