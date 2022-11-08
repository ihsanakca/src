package day_23_Arrays;

public class Arrays_Example {
    public static void main(String[] args) {

        String [] day=new String[7];
        day[0]="Pazartesi";
        day[1]="Salı";
        day[2]="Çarşamba";
        day[3]="Perşembe";
        day[4]="Cuma";
        day[5]="Cumartesi";
        day[6]="Pazar";

        for (int i = 0; i < day.length; i++) {
            if (day[i].equalsIgnoreCase("cuma")){
                System.out.println(true);
            }
        }
    }
}
