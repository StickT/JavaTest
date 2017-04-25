package com.yym.test.threaddemo;


import java.util.concurrent.CountDownLatch;

/**
 * Created by StickT on 2017/4/20.
 */
public class Thread2 extends Thread {

    CountDownLatch latch;
    private Num num;

    public Thread2(Num num,CountDownLatch latch){
        this.num = num;
        this.latch = latch;
    }

    public Num getNum() {
        return num;
    }

    public Thread2 setNum(Num num) {
        this.num = num;
        return this;
    }

    @Override
    public void run() {
        for(int i=0;i<1000000;i++)
            num.increment();
        latch.countDown();
    }
}
