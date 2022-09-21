package Day_37_Inheritance_Cont_2;

public class Fabrika {
    String personelAdi;
    boolean isActive;
    private int num;

    public Fabrika(){

    }
    public Fabrika(String personelAdi){
        this.personelAdi =personelAdi;

    }
    public Fabrika(String personelAdi, boolean isActive){
        this(personelAdi);
        this.isActive=isActive;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void firstMethod(){
        System.out.println("first class");
    }


}
