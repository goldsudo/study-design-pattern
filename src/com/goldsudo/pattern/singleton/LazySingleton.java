package com.goldsudo.pattern.singleton;

/**
 * 单例模式——懒汉式实现
 * 是否lazy初始化：是
 * 实现难度：易
 * 是否线程安全：否
 * 描述：getInstance方法没有加锁，当有多个线程同时调用该方法时，将导致该类出现多个实例
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton (){}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
