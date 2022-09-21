package Day_29_WrapleClass;

public class wrapperClassTask {
    public static void main(String[] args) {

        String str="/**(98765j456a5543*/**v23'^432a";
        String empty="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                empty+=str.charAt(i);
            }

        }System.out.println("empty = " + empty);
    }


}
