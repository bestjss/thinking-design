package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 我不会飞
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
