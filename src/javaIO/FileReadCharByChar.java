package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReadCharByChar {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("E:\\IoFiles\\charBychar.txt");

        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
    }
}
