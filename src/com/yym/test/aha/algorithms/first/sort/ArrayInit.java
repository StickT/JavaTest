package com.yym.test.aha.algorithms.first.sort;

import java.util.Random;

/**
 * Created by StickT on 2017/4/14.
 */
public class ArrayInit {

    private int[] a = new int[this.length];

    private final int length = 10000;

    private final int bound = 10000;

    public ArrayInit() {
        int i = 0;
        Random random = new Random(1000L);
        while(i < this.length){
            a[i] = Math.abs(random.nextInt(this.bound));
            i++;
        }
    }

    public int[] getA() {
        return a;
    }

    public int getLength() {
        return length;
    }

    public int getBound() {
        return bound;
    }
}
