package com.litchi.strategy;

import lombok.Setter;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 鸭子
 */
public abstract class Duck {

    @Setter
    FlyBehavior flyBehavior;

    @Setter
    QuackBehavior quackBehavior;

    /**
     * 鸭子外观
     */
    abstract void display();

    /**
     * 叫
     */
    void performQuack() {
        quackBehavior.quack();
    }

    void performFly(){
        flyBehavior.fly();
    }
}
