package bootCamp;

public class B19_Ternary {
    public static void main(String[] args) {


        int x = 500, y = 150, z = 15, result;

        result = (x >= y) & (x >= z) ? x : (y >= z) ? y : z;
        System.out.println(result);

        //Which one has longest char sequences?
        String s1="Ahmet Yıkar",s2="Mehmet Yılmaz",s3="Ercüment";
        System.out.println(((s1.length() > s2.length()) & (s1.length() > s3.length()) ? s1 : (s2.length() > s3.length()) ? s2 : s3));


        //swaping
        int a=10;
        int b=20;

        System.out.println(a+"<--->"+b);

        int temp;

        temp=a;
        a=b;//a--->20
        b=temp;//b--->10 //yer değiştirme

        System.out.println(a+"<--->"+b);




    }
}