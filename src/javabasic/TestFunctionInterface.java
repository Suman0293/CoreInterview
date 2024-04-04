package javabasic;

public class TestFunctionInterface{

    public static void main(String[] args) {
        FunctionInterface fn = new FunctionInterface() {

            public int sum(int a, int b) {

                return (a + b);
            }
        };

        int a = 10;
        int b = 20;
         System.out.println(fn.sum(a, b));
        FunctionInterface.multi(a, b);
        fn.sub(a,b); // defult void me aise likhna hai
       // FunctionInterface.sub(a, b);// static void me aise likhna hai

    }
}
