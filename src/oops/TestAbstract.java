package oops;

import com.sun.security.jgss.GSSUtil;

public class TestAbstract extends AbstractExample{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        TestAbstract t = new TestAbstract();
        int sum = t.add(10,20);
        System.out.println(sum);
    }
}
