package com.goldsudo.pattern.singleton;

/**
 * 单例模式——线程安全的懒汉式实现
 * 是否lazy初始化：是
 * 实现难度：易
 * 是否线程安全：是
 * 描述：getInstance加锁后，不允许多个线程同时访问，因此能够保证instace只被初始化一次
 * 存在的问题：
 * 虽然给getInstance加锁后能够避免线程安全问题，但是也极大的影响了效率，
 * getInstance方法在99% 情况下不需要同步，仅在第一次被调用时需要被上锁，
 * 而其他时候并不需要上锁，但是一旦使用synchronized修饰该方法，导致在任何时刻
 * 都只能有一个线程能够访问该方法。
 */
public class ConcurrentLazySingleton {
    private static ConcurrentLazySingleton instance;
    private ConcurrentLazySingleton (){}
    public static synchronized ConcurrentLazySingleton getInstance() {
        if (instance == null) {
            instance = new ConcurrentLazySingleton();
        }
        return instance;
    }
}
