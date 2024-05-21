package javaIO;


import java.io.*;

public class TestStudentSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialize.....
        StudentSerializable s = new StudentSerializable(1, "YUGAL RAJPUT");

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("E:\\IoFiles\\StudentSerili.txt"));
        o.writeObject(s);


        //Deserialize....
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("E:\\IoFiles\\StudentSerili.txt"));
        s = (StudentSerializable) i.readObject();

        System.out.println(s.getId());
        System.out.println(s.getName());

        o.close();
        i.close();
    }
}
