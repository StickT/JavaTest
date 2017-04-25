package com.yym.test.design.pattern.singleton.starve.normal;

/**
 * Created by YYM on 2017/4/18.
 * 饿汉模式
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
