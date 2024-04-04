package javabasic;

public class TestLambda {

    public static void main(String[] args) {
        FunctionInterface fn = (a, b) -> {
            return (a + b);
        };
        int a = 20;
        int b = 5;

        System.out.println(fn.sum(a, b));
        FunctionInterface.multi(a, b);
        fn.sub(a, b);
       // FunctionInterface.sub(a, b);


    }
}
