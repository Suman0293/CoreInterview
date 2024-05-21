package javaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharByChar {
    public static void main(String[] args) throws IOException {

//        FileWriter fw = new FileWriter("E:\\IoFiles\\WriteCharByChar.txt");
//
//        char[] c = {'H', 'E', 'L', 'L', 'O'};
//
//        fw.write(c);
//        fw.write(',');
//        fw.write("YUGAL");
//        fw.close();
//        System.out.println("Success");

        FileWriter fw = new FileWriter("E:\\IoFiles\\n.txt");

        FileReader reader = new FileReader("E:\\IoFiles\\Demo.txt");

        int i = reader.read();
        while (i !=-1){
            fw.write(i);
            i = reader.read();
        }
        reader.close();
        fw.close();
        System.out.println("file");
    }
}