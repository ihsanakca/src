package bootCamp;

public class B4_String {
    public static void main(String[] args) {

        // String is sequences of char value.

        String str="Big";
        String man = str.concat("Man");
        System.out.println("man = " + man);
        System.out.println("str = " + str);


        //iki yolla üretilir.
        String literal="KRAFT"; //literal way

        String byNew=new String("KRAFT"); //new key wordu ile

        //StringBuffer ve StringBuilder yoluyla üretilen stringler değişebilir. immutable değil mutable dır.

        StringBuilder strBld=new StringBuilder("Boot");
        //concat() --yerine append() kullanılır.
        strBld.append("Camp");
        System.out.println("strBld = " + strBld);//BootCamp yani değişti....
    }
}
