package GenelExercise;

public class StringSaparateIntAndAlphabetic {
    public static void main(String[] args) {
        String str = "5ab222c22jjjd1hhh23hfffdgfd45465ghgh4654";
        String[] part = str.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
        for (String each:part) {
            System.out.println("each = " + each);
    }

//            String str1="";
//            String str2="";
//            for(int i = 0; i < str.length(); i++){
//                char c = str.charAt(i);
//                if( '0' <= c && c <= '9' )
//                    str1=str1+c;
//                if( 'a' <= c && c <= 'z' )
//                    str2=str2+c;
//            }
//            System.out.println(str1);
//            System.out.println(str2);


    }
}
