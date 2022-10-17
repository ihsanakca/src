package extra;

import java.io.*;

public class B20_fileReadAndWrite {
    public static void main(String[] args) throws IOException {


        FileWriter writer=new FileWriter("C:\\Users\\HP\\Desktop\\Target.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("selam arkadaşlar");
        bufferedWriter.newLine();
        bufferedWriter.write("nasılsınız");
        bufferedWriter.newLine();
        bufferedWriter.write("iyiyiz");
        bufferedWriter.close();

        //FileReader fileReader=new FileReader("C:\\Users\\HP\\Desktop\\Target.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Target.txt"));
        System.out.println(bufferedReader.readLine());//selam arkadaşlar
        System.out.println(bufferedReader.readLine());//nasılsınız
        System.out.println(bufferedReader.readLine());//iyiyiz
        System.out.println(bufferedReader.ready());//başka satır var mı onu sorguluyor...//for döngüsüyle satırlar çoklu alınabilir...




    }
}
