package com.yym.test.design.pattern.singleton.doublecheck;

/**
 * Created by YYM on 2017/4/18.
 */
public class Singleton {

    private volatile static Singleton singleton;

    public static Singleton getSingleton() {
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
