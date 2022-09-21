package Day_37_Inheritance_Cont_2;

import java.util.Random;

public class Person {
    String name;
    String surname;
    private int id;
    double salary;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public void createID(){
        Random random=new Random();
        this.id=random.nextInt((100)+1);
    }
}
