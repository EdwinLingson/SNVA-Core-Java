package coreJava14;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("ABC.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        char ch;
        System.out.println("Enter @ to quit");
        while ((ch =(char) dataInputStream.read())!='@'){
            fout.write(ch);
        }
        fout.close();
    }
}
