package com.niujiwei.group.designpattern.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 这是大臣
 *
 * @author niujiwei
 */
public class Minister {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            Emperor emperor = Emperor.getInstance();
            try {
                TimeUnit.SECONDS.sleep(3L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            emperor.getEmperorName();
            System.out.println(emperor.toString());
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();


      /*  Emperor emperor1 = Emperor.getInstance();
        emperor1.getEmperorName();
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getEmperorName();*/
    }
}
