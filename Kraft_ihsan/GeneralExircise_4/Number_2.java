package GeneralExircise_4;

public class Number_2 {
    public static void main(String[] args) {
        String s="java ile hersey guzel";
//        System.out.println(changeToHackerLang(s));

//        for (int i = 'A'-'A'; i <='d' ; i++) {
//            if (i<'d'){
//                System.out.print(i+",");
//            }else if  (i=='d'){
//                System.out.println(i+".");
//            }
//
//        }

    }
    /*
 Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
 Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
 s -> 5
 a -> 4
 e -> 3
 i -> 1
 o -> 0
 Test data
 hackerDili("java ile hersey guzel")
 j4v4 1l3 h3r53y guz3l
 İpucu harfleri değiştirin ve ekrana yazdırın.
*/
public static String changeToHackerLang(String str){
    str=str.toLowerCase();
    if (str.contains("s")) str=str.replaceAll("s","5");
    if (str.contains("a")) str=str.replaceAll("a","4");
    if (str.contains("e")) str=str.replaceAll("e","3");
    if (str.contains("i")) str=str.replaceAll("i","1");
    if (str.contains("o")) str=str.replaceAll("o","0");

    return str;
}
}
