package oops;

public class TestAbstractInterface implements AbstractInterface{
    @Override
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        TestAbstractInterface t = new TestAbstractInterface();
        int sum = t.add(10,20);
        System.out.println(sum);
    }
}
