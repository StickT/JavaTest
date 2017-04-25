package com.yym.test.aha.algorithms.second.queuedemo;


/**
 * Created by StickT on 2017/4/19.
 * 队列是先进先出FIFO，
 */
public class QQDeciphering {

    public static void main(String []args){
        int[] q = {0,6,3,1,7,5,8,9,2,4,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int head = 1,tail = 10;
        while (head<tail){
            System.out.println(q[head]);
            head++;
            q[tail] = q[head];
            tail++;
            head++;
        }
    }
}
