package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName ThreadLocalInstance
 * @Author DiangD
 * @Date 2020/7/5
 * @Version 1.0
 * @Description 基于ThreadLocal实现单例,单个线程拿到唯一对象
 **/
public class ThreadLocalInstance {
    public static final ThreadLocal<ThreadLocalInstance> INSTANCE_THREAD_LOCAL = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return INSTANCE_THREAD_LOCAL.get();
    }

}
