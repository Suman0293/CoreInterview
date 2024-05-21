package collection.list;

import java.util.ArrayList;

public class RetainAllExample {
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add(2);
        a.add(4);
        a.add(6);
        System.out.println(a);

        ArrayList a1=new ArrayList();
        a1.add(4);
        a1.add(6);
        a1.add(5);
        System.out.println(a1);

        a.retainAll(a1);
        System.out.println(a);
        System.out.println(a.retainAll(a1));

    }

}

