package thread;

public class DeamonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon T Started : " + currentThread().isDaemon());

        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Daemon T: woke up Again");

            } catch (Exception e) {

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Main");

        DeamonThread d = new DeamonThread();
        d.setDaemon(true);
        d.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        System.out.println("Leaving main method");
        System.out.println("Now JVM will exit");
    }
}
