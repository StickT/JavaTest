package com.yym.test.design.pattern.singleton.lazy.safe;

/**
 * Created by YYM on 2017/4/18.
 */
public class Singleton {

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
