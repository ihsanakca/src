package GeneralExircise_2;

public class YikdizDikDortgen_2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int j=0; j<4; j++)
        {
            System.out.print("*");
        }
        System.out.println();


        for (int i=0; i<2; i++) //satır yüksekliği-2 kere bu işlemi tekrarla
        {
            System.out.print("*");
            for (int j=0; j<2; j++)
            {
                System.out.print(" ");//satır genişliği-2 tane yan yana boşluk karakteri yazdır
            }
            System.out.println("*");//satır sonundaki yıldızı ekle ve bir satır aşağı geç
        }

        //dikdörtgenin tabanı
        for (int j=0; j<4; j++)
        {
            System.out.print("*");//satır genişliği kadar yan yana o karakteri yazdır
        }

    }
}
