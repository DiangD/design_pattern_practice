package com.qzh.design.pattern.structural.proxy.db;

/**
 * @ClassName DataSourceContextHolder
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description
 **/
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }
}
