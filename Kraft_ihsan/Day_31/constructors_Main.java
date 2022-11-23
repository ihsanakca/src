package Day_31;

public class constructors_Main {
    public static void main(String[] args) {
       /* Flower flower=new Flower();

        System.out.println("flower.renk = " + flower.renk);

        flower.renk="kırmızı";
        System.out.println("flower.renk = " + flower.renk);*/

        Okul okul_1=new Okul();
        Okul okul_2=new Okul("sarı");
        Okul okul_3=new Okul("kırmızı",421);
        Okul okul_4=new Okul("yeşil",550,25);

        okul_4.controlKapasite();
        okul_3.controlKapasite();

        /* Flower flower=new Flower("sarı",25,true);

        System.out.println("flower.boy = " + flower.boy);
        System.out.println("flower.renk = " + flower.renk);
        System.out.println("flower.diken = " + flower.diken);*/

    }
}
