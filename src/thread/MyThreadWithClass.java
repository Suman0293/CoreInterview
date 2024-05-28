package thread;


public class MyThreadWithClass extends Thread {

    public void run() {

        System.out.println(getName());
    }

    public static void main(String[] args) {

        MyThreadWithClass t1 = new MyThreadWithClass();
        MyThreadWithClass t2 = new MyThreadWithClass();

        t1.setName("Ram");
        t2.setName("Shayam");

        t1.start();
        t2.start();

    }

}
