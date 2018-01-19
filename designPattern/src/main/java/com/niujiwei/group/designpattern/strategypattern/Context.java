package com.niujiwei.group.designpattern.strategypattern;

/**
 * 这是一个包裹装锦囊
 *
 * @author niujiwei
 */
public class Context {
    private IStrategy iStrategy;

    /**
     * 构造包裹，放入锦囊
     *
     * @param iStrategy
     */
    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    /**
     * 使用锦囊
     */
    public void operate() {
        iStrategy.operate();
    }
}
