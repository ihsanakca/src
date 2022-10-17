package bootCamp;

public class B7_MethodAndConstructor {

    //method : code fragment  which can perform special tasks.

    // Access modifier Return Type Name(Parameter){implementation/body/code}
    public static void main(String[] args) {
        message("hello");
        message();
        message(5,45.2,"hello");

        Test test=new Test("hello"); //hello
        System.out.println(test.str);//null
        test.any();//null
        test.str="world";

        test.any();//world
    }
    //method overloading
    //same method name different parameter in same class
    //return type no effect to overloading
    public static void message(String str){
        System.out.println(str);
    }
    public static void message(){
        System.out.println("hello");
    }
    public static void message(String str, int a){}
    public static void message(String str, int a,double b){}
    public static void message( int a,double b,String str){}
    public static void message( double b,int a,String str){}
    public static void message( double b,String str){}
    public static void message( int a){}

    //constructor
    //special method
    //used for creating object
    //constructor name must be same with class name.
    //return type yok
    //if we dont put any constructor java will put default empty constructor as implicit.
    // eğer parametreli bir constructor yazarsak java default olarak boş constructor oluşturmaz.



}
class Test{
    String str;

    Test(String str){
        str=str;
        System.out.println(str);

    }
    Test(String str,int i){

    }

    public void any(){
        System.out.println(str);
    }


}
