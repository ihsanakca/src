package day_44_OOP_Cont.accessModifiers_1.FinalKeyWord;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {
        final String[] BATCH2={"Talip","Alparslan"};
        BATCH2[0]="İbrahim";

        System.out.println(Arrays.toString(BATCH2));//final array içerik degisir.

        //batch2=new String[]{"Ali","Mehmet"};//batch2 final oldugundan referansı degisririlemez...

        System.out.println("-----------------------");

       final ArrayList<String> NAME=new ArrayList<>();
        NAME.add("İhsan");
        NAME.add("Enes");

        //NAME=new ArrayList<>();//final oldugundan referansı degismez ama aldıgı degerler değişebilir.

    }


}
