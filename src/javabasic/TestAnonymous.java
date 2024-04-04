package javabasic;

public class TestAnonymous {
    public static void main(String[] args) {
        FunctionInterface fn = new FunctionInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int a = 10;
        int b = 20;
        System.out.println(fn.sum(a, b));
    }
}
