package Day_32_Constructor;

public class constructorMain {
    public static void main(String[] args) {
        /*Square square=new Square();
        square.sideLenght=5;
        System.out.println("square.calculateArea() = " + square.calculateArea());
        System.out.println("square.calculatePerimeter() = " + square.calculatePerimeter());

        Square square1=new Square(6);
        System.out.println("square1.calculateArea() = " + square1.calculateArea());

        System.out.println("Square.calculatePerimeter(10) = " + Square.calculatePerimeter(10));
        System.out.println("Square.calculateArea(10) = " + Square.calculateArea(10));


        Pencil pencil=new Pencil();
        pencil.color="sarı";
        pencil.lenght=21;
        pencil.haveEraser=true;

        pencil.delete();
        pencil.write();

        Pencil pencil1=new Pencil("beyaz",2,false);
        pencil1.delete();
        pencil1.write();

        System.out.println("pencil.lenght = " + pencil.lenght);
        System.out.println("pencil1.lenght = " + pencil1.lenght);


        Cat efe=new Cat("yeşil","sokak kedisi", true, false);
        Cat minnos=new Cat("yeşil","sokak kedisi",false,true);
        Cat pamuk=new Cat("mavi","van", false,true);

        System.out.println("pamuk.eyeColor = " + pamuk.eyeColor);
        System.out.println("pamuk.food() = " + pamuk.food());
        System.out.println("minnos.food() = " + minnos.food());*/


        KraftBankCustomer enes=new KraftBankCustomer(1525454285,"Enes Yaman", true);
        System.out.println("enes.customerToken = " + enes.customerToken);

        //System.out.println("enes.customerAccount = " + enes.customerAccount);
        //enes.addMoney(500);
        //System.out.println("enes.customerAccount = " + enes.customerAccount);
      //  enes.addMoney(250);
       // System.out.println("enes.customerAccount = " + enes.customerAccount);
       // System.out.println("enes.customerFullName = " + enes.customerFullName);

        KraftBankCustomer erman=new KraftBankCustomer(25212522,"Erman Kaya",true);
        System.out.println(erman.customerToken);

        changeFullName(enes, "musa yılmaz");
        System.out.println(enes.customerFullName);

        changeFullName(erman,"Erman Zeki Kaya");
        System.out.println(erman.customerFullName);

        System.out.println("enes.customerToken = " + enes.customerToken);
    }

    public static KraftBankCustomer changeFullName(KraftBankCustomer kraftBankCustomer, String fullName){
        kraftBankCustomer.customerFullName=fullName;
        return kraftBankCustomer;
    }

    public static KraftBankCustomer changeToken(KraftBankCustomer kraftBankCustomer, String fullName){
        kraftBankCustomer.customerFullName=fullName;
        return kraftBankCustomer;
    }
}
