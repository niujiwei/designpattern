package com.niujiwei.group.designpattern.proxy;

/**
 * @author niujiwei
 * 代理类王婆 实现被代理的所有接口
 */
public class WangPo implements KindWomen {
    /**
     * 要代理的对象
     */
    private KindWomen kindWomen;

    /**
     * 默认代理潘金莲
     */
    public WangPo() {
        kindWomen = new PanJinLian();
    }

    /**
     * 代理其他对象
     *
     * @param kindWomen
     */
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public void makeEyesWithMan() {
        kindWomen.makeEyesWithMan();
    }

    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
