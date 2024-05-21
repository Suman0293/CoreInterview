package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

    public static void main(String[] args) throws IOException {

//        String source = "E://sourabh11.jpg";
//        String target = "E://naman.jpg";

        FileInputStream in = new FileInputStream("E:\\suman.jpg");
        FileOutputStream out = new FileOutputStream("E:\\demo.jpg");

        int i = in.read();
        while (i != -1) {
            out.write(i);
            i = in.read();
        }
        in.close();
        out.close();
        System.out.println("sucessfullyy......");

    }
}
