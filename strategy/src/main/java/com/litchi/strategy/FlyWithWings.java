package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 用翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用翅膀飞行");
    }
}
