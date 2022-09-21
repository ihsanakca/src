package Day_32_Constructor;

public class Pencil {

    //Pencil adında bir class oluşturun, color, lenght, haveEraser adında fields tanımlayın,
    //constructors (4 adet) , write ve delete metodları oluşturarak main metodunda bu class dan
    //bir obje oluşturun.(this() metodu kullanılacak)

    public String color;
    public double lenght;
    public boolean haveEraser;

    public Pencil (){}

    public Pencil (String color){
        this.color=color;
    }
    public Pencil (String color,int lenght) {
        this.color = color;
        this.lenght = lenght;
    }
    public Pencil (String color,int lenght, boolean haveEraser) {
        this.color = color;
        this.lenght = lenght;
        this.haveEraser=haveEraser;
    }
    public void delete (){
        if(this.haveEraser) {
            System.out.println("Silme imkanı var.");
        }else {
            System.out.println("Silme imkanı yok.");
        }

    }

    public void write(){
        if(this.lenght>5){
            System.out.println("Bu kalemle yazı yazılabilir..");
        }else {
            System.out.println("Bu kalemle yazı yazılamaz...");
        }
    }
}
