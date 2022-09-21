package Day_37_Inheritance_Cont_2;

public class Day_37_Main {
    public static void main(String[] args) {
       /* Fabrika sekerFabrikası=new Fabrika("harun",true);
        System.out.println(sekerFabrikası.personelAdi);
        System.out.println(sekerFabrikası.isActive);

        Depo depo1=new Depo();

        Tester enes=new Tester();
        Developer alparslan=new Developer();
        ProjectOwner salih=new ProjectOwner();*/

        //tum sınıflara costructor ve getter setter olacak...
        //super ve this  kullanılacak...
        //SoftwareDevolopment sınıfına 2 farklı metod yazılacak...(dailyTime,sprintDay)
        //bazı sınıflarda değişkenlerde protected, default, private kullanılacak..
        // 2 adet sınıfta static metot kullanılacak..
        //metot overriding yapılacak...


        Tester ihsan=new Tester("ihsan", "akcair","test servisi","tum alanalar");
        ihsan.createID();
        ihsan.salary=2500;
        System.out.println(ihsan.surname);
        ihsan.dailyTime();
        System.out.println(ihsan.getId());
    }
}
