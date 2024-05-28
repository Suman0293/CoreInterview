package thread;

public class JoinsMethod extends Thread {

    public void run() {
        System.out.println(getName());

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
           // e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception  {

        JoinsMethod j1 = new JoinsMethod();
        JoinsMethod j2 = new JoinsMethod();

        j1.setName("Suman");
        j1.start();
        j1.join();

        j2.setName("Shubham");
        j2.start();
        j2.join();

    }

}
