package com.yym.test.design.pattern.singleton.starve.mutation;

/**
 * Created by YYM on 2017/4/18.
 * 饿汉变种模式
 */
public class Singleton {

    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
