public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("Conuter-1", 1);
        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(10000);
        c1.stop();
    }
}