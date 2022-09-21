package day_34_staticVariable.staticClass;

public class Outer {

    static class nested{
        public static void message(){
            System.out.println("selam static class'tan...");
        }
    }
    class inner{
        public void message(){
            System.out.println("selam inner class'tan...");
        }

    }
}
class main{
    public static void main(String[] args) {
        Outer.nested.message();

        Outer outer=new Outer();//bu ve alttaki satır ile
        Outer.inner selam1=outer.new inner();//alttaki satır...
        selam1.message();


        Outer.inner selam=new Outer().new inner();//bu satır aynı görevi yapıyor.
        selam.message();
    }
}