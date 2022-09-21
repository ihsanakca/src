package Day_29_WrapleClass;

public class wrapperTask_2 {
    public static void main(String[] args) {

        String str="dsgffghfgj ngfgfhf kjjljklgfh hhjkk 1 2 3 4 sdsdsd mdsmsmdsd" +
                "sdsd" +
                "dsdsdsdsdsdsdsdsdsdsd hfhjjhjghj";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(str.charAt(i)+"");
            }

        }
        System.out.println("sum = " + sum);
    }
}
