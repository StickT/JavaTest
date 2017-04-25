package com.yym.test.aha.algorithms.first.sort;

/**
 * Created by StickT on 2017/4/14.
 */
public class BarrelSort {


    /**
     *
     * @param a array which every element is an int
     * @param length this array's length
     */
    public static void sort(int[] a,int bound){
        int book[] = new int[bound+1];
        for (int i=0;i<bound+1;i++){
            book[i] = 0;
        }
        for (int i=0;i<bound+1;i++){
            book[a[i]]++;
        }
        for (int i=0;i<=bound+1;i++){
            for (int j=0;j<=book[i];j++){
                System.out.print(i+"  ");
            }
        }
    }
}
