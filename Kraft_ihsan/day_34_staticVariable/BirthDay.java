package day_34_staticVariable;

public class BirthDay {

    static int cakeSlice=28;

    public void takeASlice(){
        cakeSlice--;
    }
public void takeASlice(int count){
        cakeSlice-=count;
}

}
class main2{
    public static void main(String[] args) {




        BirthDay zafer=new BirthDay();
        BirthDay enes=new BirthDay();
        BirthDay ilyas=new BirthDay();
        BirthDay ridvan=new BirthDay();
        BirthDay talip=new BirthDay();
        BirthDay ramazan=new BirthDay();
        BirthDay talha=new BirthDay();

        System.out.println(BirthDay.cakeSlice);

        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        ridvan.takeASlice();
        talip.takeASlice();
        ramazan.takeASlice();
        talha.takeASlice();
        zafer.takeASlice(2);
        ilyas.takeASlice(1);


        System.out.println(BirthDay.cakeSlice);
    }
}