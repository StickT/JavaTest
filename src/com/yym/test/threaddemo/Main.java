package com.yym.test.threaddemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by StickT on 2017/4/20.
 */
public class Main {

    public static void main(String []args) throws InterruptedException{
        Num num = new Num();
        CountDownLatch latch = new CountDownLatch(2);
        Thread1 thread1 = new Thread1(num,latch);
        Thread2 thread2 = new Thread2(num,latch);
        thread1.start();
        thread2.start();

        latch.await();


        System.out.println(num.getCount());

    }
}
