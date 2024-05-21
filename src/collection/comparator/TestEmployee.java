package collection.comparator;

import collection.comparator.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(4, "jhjio", 1000);
        Employee e2 = new Employee(2, "bbb", 2000);
        Employee e3 = new Employee(3, "aaa", 2500);

        List list = new ArrayList();

        list.add(e1);
        list.add(e2);
        list.add(e3);


        //Collections.sort(list, new OrderByIdAsc());
        // Collections.sort(list, new OrderByIdDesc());
         Collections.sort(list, new OrderByNameAsc());

        Iterator it = list.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }


}
