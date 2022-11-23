package generalExercise_3;

public class StringLabNew {
    public static void main(String[] args) {
        String s="üDün akşam eve gideüürken onları görmüştümü.ü";
        System.out.println(beforeAfterLetter(s));

    }
    public static String beforeAfterLetter(String str){
        str=str.toLowerCase();
        String result="";
        if ((str.substring(0,1)).equals("ü")){
            result+=str.substring(1,2);}
        for (int i = 1; i <str.length()-1 ; i++) {
            if (str.substring(i,i+1).equals("ü")){
                result+=str.substring(i-1,i)+str.substring(i+1,i+2);
            }
            }
            if (str.substring((str.length()-1)).equals("ü")){
                result+=str.substring(str.length()-2,str.length()-1);
            }
            return result;
        }
    }

