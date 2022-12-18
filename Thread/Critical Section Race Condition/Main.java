import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        ArrayList<Thread> islemler = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(orderMatic);
            islemler.add(t);
            t.start();
        }

        for (Thread t : islemler) {
            t.join();
        }
        System.out.println(orderMatic.getOrderNO());
    }
}