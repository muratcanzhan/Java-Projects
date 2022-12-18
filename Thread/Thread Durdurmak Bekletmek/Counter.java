public class Counter implements Runnable {
    private String name;
    private int id;
    private boolean isRun;

    public Counter(String name,int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " Çalýþtý !");
        int i = 0;
        while (isRun) {
                try {
                    Thread.sleep(1000L * this.id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.name + ":" + ++i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop() {
        this.isRun = false;
    }
}

