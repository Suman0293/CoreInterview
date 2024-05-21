package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class TestFailFast {

    public static void main(String[] args) {

        List list = new ArrayList();

        // ArrayBlockingQueue list = new ArrayBlockingQueue(10); // for fail safe

        list.add("one");
        list.add("abc");
        list.add(200);
        list.add(false);

        Iterator it = list.iterator();

        list.add(100);

        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}
