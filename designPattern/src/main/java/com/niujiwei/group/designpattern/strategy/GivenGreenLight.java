package com.niujiwei.group.designpattern.strategy;

/**
 * 这是另一个计谋
 *
 * @author niujiwei
 */
public class GivenGreenLight implements IStrategy {

    public void operate() {
        System.out.println("求吴国开个绿灯放行！！");
    }
}
