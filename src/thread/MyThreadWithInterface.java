package thread;

public class MyThreadWithInterface implements Runnable {

    @Override
    public void run() {

        // task for thread
        for (int i = 1; i <= 5; i++) {

            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        // create object of Mythread class

        MyThreadWithInterface t1 = new MyThreadWithInterface();

        Thread th = new Thread(t1);

        th.start();

    }

}

