package Day_37_Inheritance_Cont_2;

public class Tester extends SoftwareDevelopmentTeam{
    boolean isManual;

    public Tester(String name, String surname, String teamName, String domain) {
        super(name, surname, teamName, domain);
    }
    public static void testProgram(){
        System.out.println("test programı seleniumdur.");
    }
    public void dailyTime(){
        System.out.println("testerların mesai kavramı yoktur.");
    }
}
