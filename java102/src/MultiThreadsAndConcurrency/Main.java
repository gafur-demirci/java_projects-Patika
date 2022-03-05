package MultiThreadsAndConcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Counter c1 = new Counter("Counter -1");

        //Counter c2 = new Counter("Counter -2");

        /*Counter c1 = new Counter("c1",1);
        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(3000);
        c1.stop();*/

        /*Counter c2 = new Counter("c2",2);
        Thread t2 = new Thread(c2);
        t2.start();
        c2.stop();*/

        //Banka sıra no verme işlemi

        OrderMatic oMatic = new OrderMatic();
        /*Thread t1 = new Thread(o1);
        t1.start();
        t1.join();*/

/*
        Thread t2 = new Thread(oMatic);
        *//*t2.start();
        t2.join();*//*

        List<Thread> threads = new ArrayList<>();
        for (int i =0; i < 100; i++){
            Thread t = new Thread(oMatic);
            threads.add(t);
            t.start();
        }
        //birbirlerini beklemeleri için join() letiliyor
        for (Thread t : threads){
            t.join();
        }

        System.out.println(oMatic.getOrderNo());*/

        //Threadpool

        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i =0; i < 100; i++){
            pool.execute(oMatic);
        }

    }
}
