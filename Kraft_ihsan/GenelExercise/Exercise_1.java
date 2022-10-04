package GenelExercise;

public class Exercise_1 {
    public static int yas;
    public static String name,surname, adress,id;

    static {
        System.out.println("static metod");
    }
    {

                System.out.println("instant metod");


    }
    public Exercise_1(int yas, String name, String surname, String adress) {
        this.yas = yas;
        this.name = name;
        this.surname=surname;
        this.adress = adress;

        id=name.charAt(0)+surname.substring(0,2)+yas;
        System.out.println("cons çalıştı");
    }
    public String getToken(int yas){
        String token=yas*yas+" TKN";
        return token;
    }
}
