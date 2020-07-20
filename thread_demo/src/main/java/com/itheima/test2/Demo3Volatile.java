package com.itheima.test2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3Volatile {

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo demo = new VolatileDemo();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(demo);
            t.start();
        }

        Thread.sleep(1000);
        System.out.println(demo.count);
    }

    static class VolatileDemo implements Runnable {
        public volatile int count;
        //public static AtomicInteger count = new AtomicInteger(0);

        public void run() {
            addCount();
        }

        //private ReentrantLock lock = new ReentrantLock();

        public void addCount() {
            for (int i = 0; i < 10000; i++) {
                //lock.lock();
                count++;
                //count.incrementAndGet();
                //lock.unlock();
            }
        }
    }
}