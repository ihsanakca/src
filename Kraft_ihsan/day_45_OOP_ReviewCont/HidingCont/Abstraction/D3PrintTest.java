package day_45_OOP_ReviewCont.HidingCont.Abstraction;

public class D3PrintTest {
    public static void main(String[] args) {
        Mod1 mod1=new Mod1("doll","OBJ");
        System.out.println("----------------------");
        Mod1 mod2=new Mod1("toycar","OBL");
        System.out.println("----------------------");
        Mod1 mod3=new Mod1("toytruck","OKJ");
        System.out.println("----------------------");
        Mod1 mod4=new Mod1("monkey","OBJ");
        System.out.println("----------------------");
        Mod1 mod5=new Mod1("baby","OYJ");
        System.out.println("----------------------");
        //mod1.extrude();mod1.polish();
    }
}
