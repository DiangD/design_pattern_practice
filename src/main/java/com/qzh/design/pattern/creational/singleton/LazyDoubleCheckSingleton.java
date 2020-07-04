package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName LazyDoubleCheckSinglrton
 * @Author DiangD
 * @Date 2020/7/3
 * @Version 1.0
 * @Description 懒汉式 两次判断
 **/
public class LazyDoubleCheckSingleton {
    //禁用重排序
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     *由于直接在静态方法使用synchronized，锁的是class对象，即其他线程无法获取此锁。降低性能可以优化。
     *正真需要同步的是延迟加载这个代码块，而不是整个方法。
     * 由于可能发生重排序导致对象未初始化就先完成引用的操作—> lazySingleton !=null,会出现线程安全问题。
     * 所以使用volatile使lazySingleton对所有线程可见。
     */
    public static LazyDoubleCheckSingleton getInstance() {
        //延迟加载
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                    // TODO: 2020/7/4 理解volatile JMM 重排序 happens-before
                    /*
                       1. 分配内存
                       2. 初始化对象
                       3. 将lazySingleton 指向该对象
                       可能会发生指令重排序（仅针对单个处理器中执行的指令序列和单个线程中执行的操作）
                     */
                }
            }
        }
        return lazySingleton;
    }
}
