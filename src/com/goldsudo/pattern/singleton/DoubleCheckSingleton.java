package com.goldsudo.pattern.singleton;

/**
 * 单例模式——双重检测实现线程安全的懒汉式实现
 * 是否lazy初始化：是
 * 实现难度：难
 * 是否线程安全：是
 * 描述：本例不同于ConcurrentLazySingleton使用synchronized锁住整个getInstance方法，
 * 而是仅锁注初始化类实例的代码块，因此在保证了线程安全的同时也兼顾了getInstance方法的访问效率。
 * 重点：
 * 1.之所以需要使用双重检测机制，即在同步代码块外部和内部两次判断instance是否为空，考虑如下情况：
 * 假设多个线程同时检测到instance为空，执行到了synchronized (DoubleCheckSingleton.class) {...}这一行，
 * 当第一个拿到锁的线程执行完毕，第二个线程将进入同步代码块中，如果此时不进行第二次非空检测，那么类将被第二次初始化
 * <p>
 * 2.之所以要将instance变量声名为volatile，是因为类的初始化过程并不是原子的，类的初始化过程被编译器编译成如下指令：
 * memory = allocate(); //1.分配对象的内存空间
 * ctorInstance(memory); //2.初始化对象
 * instance = memory; //3.设置instance指向刚分配的内存空间地址
 * 这三个指令的顺序由于jvm的指令重排机制，不一定就按顺序执行，可能会被调整成如下顺序：
 * memory = allocate(); //1.分配对象的内存空间
 * instance = memory; //3.设置instance指向刚分配的内存空间地址
 * ctorInstance(memory); //2.初始化对象
 * 即第3地址引用步提到了对象初始化的前面，这就可能导致getInstance方法返回一个没有初始化完成的instance对象。
 * 因此需要使用volatile来禁止指令重排。
 * <p>
 * （注：volatile不仅可以防止指令重排，也可以保证线程访问的变量值是主内存中的最新值）
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
