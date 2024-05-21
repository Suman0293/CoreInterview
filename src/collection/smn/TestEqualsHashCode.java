package collection.smn;

import collection.smn.EqualsHashCode;

public class TestEqualsHashCode {

    public static void main(String[] args) {

        EqualsHashCode d1 = new EqualsHashCode(101, "raj", 100);
        EqualsHashCode d2 = new EqualsHashCode(101, "raj", 100);

        if (d1.equals(d2)) {
            //if(d1.hashCode()==d2.hashCode()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

