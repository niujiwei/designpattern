package com.niujiwei.group.designpattern.proxy;

/**
 * @author niujiwei
 * 主方法 执行代理类
 */
public class XiMenQing {
  /*  public static void main(String[] args) {
        KindWomen kindWomen = new WangPo();
        kindWomen.makeEyesWithMan();
        kindWomen.happyWithMan();
    }*/

    public static void main(String[] args) {
        JiaShi jiaShi = new JiaShi();
        KindWomen kindWomen = new WangPo(jiaShi);
        kindWomen.makeEyesWithMan();
        kindWomen.happyWithMan();
    }
    /**
     * 总结：已知所有属性和方法，不利于扩展，如果增加则会容灾
     */
}
