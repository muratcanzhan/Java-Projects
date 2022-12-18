public class OrderMatic implements Runnable {
    private int orderNO;

    public OrderMatic() {
        this.orderNO = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        increaseOrder();
    }

    public int getOrderNO() {
        return orderNO;
    }

    public void setOrderNO(int orderNO) {
        this.orderNO = orderNO;
    }
    public synchronized void increaseOrder() {
        this.orderNO++;
        System.out.println(Thread.currentThread().getName() + "- OrderNO =>" + this.orderNO);
    }
}
