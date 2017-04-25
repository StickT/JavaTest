package com.yym.test.aha.algorithms.first.sort;

/**
 * Created by StickT on 2017/4/14.
 */
public class Main {

    public static void main(String[] args) {
        ArrayInit arrayInit = new ArrayInit();
        int[] a = arrayInit.getA();

//        System.out.println(new Date().getTime());
//        BubbleSort.sort(a);
//        System.out.println(new Date().getTime());

//        System.out.println(new Date().getTime());
//        QuickSort.sort(0,arrayInit.getLength()-1,a);
//        System.out.println(new Date().getTime());

//        System.out.println(new Date().getTime());
//        BarrelSort.sort(a,arrayInit.getBound());
//        System.out.println(new Date().getTime());

        for (int i=0;i<arrayInit.getLength();i++){
            System.out.print(a[i]+",");
        }
        System.out.print("\n");

    }
}
