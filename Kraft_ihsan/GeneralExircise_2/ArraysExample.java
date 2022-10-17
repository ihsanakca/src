package GeneralExircise_2;

public class ArraysExample {
    public static void main(String[] args) {

        int [][] dimArr=new int[5][4];

        dimArr[0][0]=1;
        dimArr[0][1]=5;
        dimArr[0][2]=12;
        dimArr[1][0]=71;
        dimArr[1][1]=41;
        dimArr[1][2]=22;
        dimArr[2][0]=35;
        dimArr[2][1]=185;
        dimArr[2][2]=71;


        System.out.println(dimArr.length);
        System.out.println(dimArr[0].length);

        for (int i = 0; i < dimArr.length; i++) {
            System.out.println();
            for (int d = 0; d < dimArr[i].length; d++) {
                System.out.print(dimArr[i][d]+" ");
                
            }

        }
    }
}
