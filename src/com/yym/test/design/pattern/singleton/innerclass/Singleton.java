package com.yym.test.design.pattern.singleton.innerclass;

/**
 * Created by YYM on 2017/4/18.
 */
public class Singleton {

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
