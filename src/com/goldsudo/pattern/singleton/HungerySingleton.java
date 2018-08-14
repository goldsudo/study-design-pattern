package com.goldsudo.pattern.singleton;

/**
 * 单例模式——线程安全的饿汉式实现
 * 是否lazy初始化：否
 * 实现难度：易
 * 是否线程安全：是
 * 描述：getInstance没有加锁，执行效率会提高。之所以线程安全，因为instance是类静态变量。
 * 基于类加载机制，HungerySingleton的类静态变量instance在类装载时就实例化，避免了多线程的同步问题。
 * 但也正因此无法达到延迟加载的效果，当该类消耗的资源较大时，会造成资源浪费。
 */
public class HungerySingleton {

    private static HungerySingleton INSTANCE = new HungerySingleton();

    //让构造函数为 private，这样该类就不会被实例化
    private HungerySingleton() {
    }

    //获取唯一可用的对象
    public static HungerySingleton getInstance() {
        return INSTANCE;
    }
}
