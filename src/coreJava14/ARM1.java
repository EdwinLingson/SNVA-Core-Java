package coreJava14;

import java.io.FileInputStream;

public class ARM1 {
    public static void main(String[] args) {
        int i;
        try (FileInputStream fin = new FileInputStream("ABC2.txt")){
            do {
              i= fin.read();
                System.out.print((char) i);
            }while (i!=-1);
        }catch (Exception e){
            System.out.println("File not Found");
        }
    }
}
