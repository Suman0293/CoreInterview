package javaIO;

import java.io.*;

public class MergeFileExample {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("E:\\IoFiles\\Merge.txt"));
        BufferedReader br = new BufferedReader(new FileReader("E:\\IoFiles\\Suman.txt"));

        String s = br.readLine();
        while (s != null) {
            pw.write(s);
            s = br.readLine();
        }
        br.close();
        br = new BufferedReader(new FileReader("E:\\IoFiles\\Suman1.txt"));
        String s1 = br.readLine();
        while (s1 != null) {
            pw.write(s1);
            s1 = br.readLine();
        }
        br.close();
        pw.close();
        System.out.println("Success..........");
    }
}
