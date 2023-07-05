package coreJava14;

import java.io.*;

public class ReadCopy1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("New File.txt");
        FileInputStream fin = new FileInputStream("ABC2.txt");
        BufferedOutputStream bout =  new BufferedOutputStream(fout);
        BufferedInputStream bin = new BufferedInputStream(fin);

        int i;
        while ((i=bin.read())!=-1){
            bout.write(i);
        }
        bout.close();
        bin.close();

    }
}
