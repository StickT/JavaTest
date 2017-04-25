package com.yym.test.aha.algorithms.first.sort;

/**
 * Created by StickT on 2017/4/14.
 */
public class QuickSort {

    public static void sort(int left,int right,int[] a){
        if(right < left){
            return;
        }

        int i,j,temp;
        temp = a[left];
        i = left;
        j = right;
        while(i!=j){
            while (a[j] >=temp && i<j)
                j--;
            while (a[j] <=temp && i<j)
                i++;
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        sort(left,i-1,a);
        sort(i+1,right,a);
    }

}
