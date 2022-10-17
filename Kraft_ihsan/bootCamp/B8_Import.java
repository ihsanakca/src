package bootCamp;

import java.util.Scanner;

import static java.lang.Math.*;

public class B8_Import {


    //normal import---- mesela scanner classını java.utilden import ederken olduğu gibi.
    //import packageName.ClassName;---- belli bir class
    //import packageName.*----- all

    //static import
    //bir classın static memberlarına doğrudan erişilince oluyor.Math classında olduğu gibi
    //import static packageName.ClassName.*;

    Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        int i=max(5,8);
        int j=max(5,7);
        System.out.println(i * j);
        System.out.println("PI*3.5 = " + PI * 3.5);//PI yı direkt math clasından alıyor cunku static import var
    }




}
