package Day_37_Inheritance_Cont_2;

public class HumanResources extends Person{
    String areaResponsibily;

    public HumanResources(String name, String surname, String areaResponsibily) {
        super(name, surname);
        this.areaResponsibily = areaResponsibily;
    }
}
