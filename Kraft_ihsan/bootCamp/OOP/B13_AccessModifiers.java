package bootCamp.OOP;

public class B13_AccessModifiers {

        //private:visible/reachable only within class
        //protected:visible/reachable in same package, and reachable outside if there is an inheritance
        //default:reachable in same package
        //public:reachable from everywhere

        //** private constructor nesne üretilmesini o sınıftan engeller
        public static void main(String[] args) {
//            Restricted r=new Restricted();//cannat create an object from this class. because cons is private....
        }
}
class Restricted{
    private Restricted() {
    }
}