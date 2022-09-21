package day_34_staticVariable.staticBlocks;

public class BloksVs {
    static int i=10;

    public BloksVs(int i) {
        this.i = i;
        System.out.println("constructor çalıştı.");
    }
    static {
        System.out.println("static blok çalıştı.");
        i=i*10;
        System.out.println("i = " + i);
    }
    {
        System.out.println("instance blok çalıştı.");
    }
}
