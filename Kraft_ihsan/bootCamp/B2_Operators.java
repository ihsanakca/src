package bootCamp;

public class B2_Operators {
    public static void main(String[] args) {
        //Aritmetic Ops  * + - /
        int i=5+3/2+1-1;
        System.out.println("i = " + i);
        i=5+3*2+2-1;
        System.out.println("i = " + i);
        i=5+(int)3.1+2-1;
        System.out.println("i = " + i);
        System.out.println("-----------------");
        i=(int)(3.4+6.6);
        System.out.println("i = " + i);
        i=  (int)3.4+(int)6.6;
        System.out.println("i = " + i);

        i= (int) (4.5+(double) (5/2));//6
        System.out.println("i = " + i);

        i= (int) (4.5+(double) 5/2);//7
        System.out.println("i = " + i);

        int s=(int)(10.5+12.7);//23
        System.out.println("s = " + s);

        int dd=(int)(double) (5/2);//2
        System.out.println("dd = " + dd);


        //Unary Ops
        //+  -  ++  --  !
        int value=0;
        value++;//postfix increment
        System.out.println("value = " + value);//1

        ++value;//prefix increment
        System.out.println("value = " + value);//2


        //assignment operators
        //=, += vb
        //the equality and realition ops
        // ==, < > <= vb
        //conditional  /logical ops
        //& | vb

        int a=4; int b=7;boolean bl;

        bl=b+a>10^b*a>25;
        System.out.println("bl = " + bl);
    }
}
