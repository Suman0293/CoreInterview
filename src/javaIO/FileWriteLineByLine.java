package javaIO;

import java.io.*;

public class FileWriteLineByLine {
    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("D://faltu//filewriter.txt", true);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IoFile\\filewriter.txt", true));
//
//        char[] charArry = {'h', 'i'};
//
//        bw.write(charArry);
//        bw.write(',');
//        bw.write("SunRays");
//
//        System.out.println("Successfully........");
//
//
//        bw.close();
//        // fw.close();


        FileReader reader = new FileReader("E:\\IoFiles\\filewriter.txt");

        BufferedReader br = new BufferedReader(reader);

        PrintWriter pw = new PrintWriter("E:\\IoFiles\\filewriter1.txt");

        String str = br.readLine();

        while (str != null) {


            pw.write(str);
            System.out.println(str);
            str = br.readLine();

        }
        reader.close();
        br.close();
    }
}