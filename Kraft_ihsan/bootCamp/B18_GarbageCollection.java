package bootCamp;

public class B18_GarbageCollection {
    public static void main(String[] args) {



            //two ways
            //1-re-assign dan sonra garbage a gider. yeni değer aldığından eskisi garbage olur.

            String str="Car";//burası garbage oldu..compiler bunu finalize metodu ile garbage collectiona taşır.
            str="truck";

            //2-assign null
            String str2="cat";//burası garbage oldu..compiler bunu finalize metodu ile garbage collectiona taşır.
            str2=null;

            //how/when to send an object to garbage collection..
            // if an object is without reference it will threw garbage...referansız kaldığında garbage a yollanır...

    }
}
