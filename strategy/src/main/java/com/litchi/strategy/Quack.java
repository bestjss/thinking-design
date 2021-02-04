package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 叫行为
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是呱呱叫");
    }
}
