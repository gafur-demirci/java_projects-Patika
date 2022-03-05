package MultiThreadsAndConcurrency;

public class OrderMatic implements Runnable{

    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //aynı numarayı farklı kişiler almasın (senkron olsun) diye yazıldı
        //bu ilk yol bunu bir method olarak yazıp çağırabiliriz de
        /*
        synchronized (LOCK){
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() +
                    "- Order No => " + this.orderNo);
        }*/
        increaseOrder();

    }

    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() +
                "- Order No => " + this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        orderNo = orderNo;
    }
}
