package Day_29_WrapleClass;

public class wrapperTask_2 {
    public static void main(String[] args) {

        String str="dsgffghfgj ngfgfhf kjjljklgfh hhjkk 1 2 3 4 sdsdsd mdsmsmdsd" +
                "sdsd" +
                "dsdsdsdsdsdsdsds8dsdsd hfhjjhjghj";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(str.charAt(i)+"");
            }

        }
        System.out.println("sum = " + sum);

        int a=13,b=14,c=12;

        int max=(a>b)?a:b;
        System.out.println("max = " + max);
        int maxest=(a>b)&(a>c)?a:((b>c)?b:c);
        int maxest2=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("maxest2 = " + maxest2);
        System.out.println("maxest = " + maxest);

        String s="424%+^&/())=j'''^^!+%%205254+%+a@@%&+v23242%+^/()=?a";
        System.out.println("ayiklama(s) = " + ayiklama(s));
    }
    public static String ayiklama(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
