package javaIO;

import java.io.*;

public class EmailReadWrite {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("E:\\IoFiles\\mail.txt"));

        FileWriter fw = new FileWriter("E:\\IoFiles\\mailWrite.txt");
        PrintWriter pw = new PrintWriter(fw);

        String s = br.readLine();

        while (s != null) {
            if (s.endsWith("@gmail.com")) {
                pw.println(s);
                System.out.println(s);
            }
            s = br.readLine();
        }

        pw.close();


    }
}