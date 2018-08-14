package com.goldsudo.pattern.singleton;

/**
 * 单例模式——枚举式实现（最优实现）
 * 是否lazy初始化：否
 * 实现难度：易
 * 是否线程安全：是
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 重点：
 * 之前写的一些单例模式的实现方式其实都能通过反射攻击来调用私有的构造函数，而使用枚举的方式实现单例则可以解决这个问题。
 */
public enum EnumSingleton {
    INSTANCE;
    public void someMethod(){
        //some logic
    }
}
