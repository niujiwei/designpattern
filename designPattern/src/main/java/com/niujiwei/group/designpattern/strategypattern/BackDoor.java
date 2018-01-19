package com.niujiwei.group.designpattern.strategypattern;

/**
 * 这是其中一个计谋
 *
 * @author niujiwei
 */
public class BackDoor implements IStrategy {

    public void operate() {
        System.out.println("找到乔国老施加压力！！");
    }
}
