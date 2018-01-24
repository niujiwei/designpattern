package com.niujiwei.group.designpattern.singleton;

/**
 * 通用单例模式
 *
 * @author niujiwei
 */
public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {

    }

    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }

    public void getName() {
        System.out.println("这是通用的单例模式");
    }
}
