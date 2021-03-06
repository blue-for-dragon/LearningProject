package com.lyl.juc;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class NotSafeDemo {
    /**
     * 1.故障现象
     *      java.util.ConcurrentModificationException
     * 2.原因
     *      ArrayList线程不安全
     *      Vector安全
     * 3.解决方案
     *      3.1 vector
     *      3.2 Collections.synchronizedList(new ArrayList<>())
     *      3.3 new CopyOnWriteArrayList<>()
     * 4.优化建议
     * @param args
     */
    public static void main(String[] args) {
        List<String> list= new CopyOnWriteArrayList<>();
        Set<String> set=new CopyOnWriteArraySet<>();
        new HashSet<>();
        //list.forEach(System.out::println);
        for (int i = 0; i <3 ; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
