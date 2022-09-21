package Day_37_Inheritance_Cont_2;

public class SoftwareDevelopmentTeam extends Person{

    String teamName;
    String domain;
    private int numberOfPersonel;

    public SoftwareDevelopmentTeam(String name, String surname, String teamName, String domain) {
        super(name, surname);
        this.teamName = teamName;
        this.domain = domain;

    }

    public int getNumberOfPersonel() {
        return numberOfPersonel;
    }

    public void setNumberOfPersonel(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }

    public void dailyTime(){
        System.out.println("Sabah 8 akşam 5 arasında çalışılır.");
    }
    public void sprintDay(int dayOfMonth){
        if(dayOfMonth%3==0){
            System.out.println("bugün sprint günüdür.");
        }
    }
}
