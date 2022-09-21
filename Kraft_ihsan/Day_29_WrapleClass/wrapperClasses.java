package Day_29_WrapleClass;

public class wrapperClasses {
    public static void main(String[] args) {
        Byte B=new Byte((byte) 127);
       Byte B2=new Byte("127");
        System.out.println("B = " + B);
        System.out.println("B2 = " + B2);

        Short S=new Short((short)1000);
        Short S2=new Short("1000");

        Integer I=new Integer(10000);
        Integer I2=new Integer("10000");

        Long L=new Long(1000000);
        Long L2=new Long("1000000");

        Double D=new Double(3.14);
        Double D2=new Double("3.14");

        Float F=new Float(1.2);
        Float F2=new Float("1.2");

        Character C=new Character('a');

        //Autoboxing

        int i=10;
        Integer x=i;

        Integer x1=new Integer(5);
        int i1=x1; //Unboxing


        double dbl=new Double(3.14);//unboxing

        Double db=10.0;//new keyword olmadan da oluyor...

        //valueOf

        Integer integer=Integer.valueOf("10");
        Integer integer1=Integer.valueOf(10);
     System.out.println( integer + integer1);

     Boolean Bl=Boolean.valueOf("true");
     Boolean Bl1=Boolean.valueOf(true);

     //parse metodu

     int y=Integer.parseInt("101");
     System.out.println("y = " + y);

     int y1=Integer.parseInt("-101");
     System.out.println("y1 = " + y1);

     int y3=Integer.parseInt("+100");
     System.out.println("y3 = " + y3);

     Double dble=Double.parseDouble("100");
     String str="23";
     Double dble2=Double.parseDouble (str);

     Boolean bl=Boolean.parseBoolean("true");


    }
}
