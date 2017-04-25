package com.yym.test.aha.algorithms.second.fullpermutation;

/**
 * Created by StickT on 2017/4/19.
 * 数字的全排列，有几个数字，就循环嵌套几次即可
 */
public class FullPermutation {

    public static void main(String []args){
        Integer a,b,c;
        int n = 3;
        for (a=1;a<=n;a++)
            for (b=1;b<=n;b++)
                for (c=1;c<=n;c++)
                    if(a!=b && a!=c && b!=c)
                        System.out.println(a.toString()+b.toString()+c.toString());
    }
}
