package com.qzh.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Author DiangD
 * @Date 2020/7/4
 * @Version 1.0
 * @Description 容器的单例模式
 **/
public class ContainerSingleton {
    private static final Map<String, Object> singletonMap = new ConcurrentHashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!StringUtils.isBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("object", "object");
        map.put("object", "11");
        System.out.println(map.get("object"));

    }
}
