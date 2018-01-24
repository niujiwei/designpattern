package com.niujiwei.group.designpattern.singleton;

/**
 * 单例模式一个皇帝
 *
 * @author niujiwei
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {
    }

    /**
     * 存在线程安全问题
     */
    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public void getEmperorName() {
        System.out.println("我是皇帝某某");
    }
}
