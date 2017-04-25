package com.yym.test.javapuzzle;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by StickT on 2017/4/17.
 */
public class Main {

    public static void main(String[] args){
//        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
//        System.out.println(12345+5432L);
        int a = 3,b = 5;
        a = a ^ b;                     //a = 3 ^ 5
        b = a ^ b;                     //b = (3 ^ 5) ^ 5
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
