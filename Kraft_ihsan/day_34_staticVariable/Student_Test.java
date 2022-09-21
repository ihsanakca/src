package day_34_staticVariable;

public class Student_Test {
    public static void main(String[] args) {
        Student_ student_1=new Student_(150,"Talip");
        Student_ student_2=new Student_(151,"Bahar");
        Student_ student_3=new Student_(152,"Hatice");
        Student_ student_4=new Student_(153,"İbrahim");

        student_1.schoolName="NewKraft";
        Student_.schoolName="NewKraft";

        System.out.println(student_1.getInfo());
        System.out.println(student_2.getInfo());
        System.out.println(student_3.getInfo());
        System.out.println(student_4.getInfo());

    }
}
