package coreJava14;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class CreateFile2 {
    public static void main(String[] args) throws IOException {
        String str = "\nThis is from CreateFile2...\n done at " + LocalDateTime.now();
        FileWriter fin = new FileWriter("ABC2.txt",true);
//        BufferedOutputStream bout = new BufferedOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(fin);
        for (int ctr = 0; ctr < str.length(); ctr++) {
            bw.write(str.charAt(ctr));
        }

        bw.close();
    }
}
