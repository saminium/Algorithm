package thread;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by szeru on 12/12/2018
 */
public class ThreadDemo {

    public static void main(String[] args) {

        Counter counter = new Counter(new ReentrantLock());

        Runnable runnable = () -> System.out.println("Thread Name : " + Thread.currentThread().getName() + " Counter : " + counter.getCounter());

                /*new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Name : " +  Thread.currentThread().getName() + " Counter : " + counter.getCounter());
            }
        };*/
        List<Thread> threads;
        for (int i = 0; i < 100; i++) {
            threads = new ArrayList(Arrays.asList(new Thread(runnable, "" + i)));
     /*           }
        Thread t1 = new Thread(runnable, "T1");
        Thread t2 = new Thread(runnable, "T2");
        Thread t3 = new Thread(runnable, "T3");
        Thread t4 = new Thread(runnable, "T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();*/
            threads.forEach(thread -> thread.run());

        }

    }
}

class Counter {


    private Lock lock;
    private int counter = 0;

    Counter(Lock lock) {
        this.lock = lock;
    }

    public int getCounter() {
       lock.lock();
        try {
            counter++;
            return counter;
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return 0;
    }
}


