package com.yym.test.design.pattern.singleton.lazy.notsafe;

/**
 * Created by YYM on 2017/4/18.
 * 懒汉模式,线程不安全
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
