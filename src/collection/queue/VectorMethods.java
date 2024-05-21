package collection.queue;


import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {

    public static void main(String[] args) {

        Vector v = new Vector(); // Initial capacity of this constructor is 10

        v.addElement("Suman");
        v.addElement("Bhardwaj");
        v.addElement(25);
        v.addElement("smn");
        System.out.println(v);

        v.setElementAt("Verma", 1);
        System.out.println(v);


        System.out.println(v.subList(0, 2));//index 0 or length 2

        System.out.println(v.firstElement());
        System.out.println(v);
        System.out.println(v.capacity());

        Enumeration en = v.elements();
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }



}

