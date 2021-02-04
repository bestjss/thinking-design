package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 橡皮鸭
 */
public class RubberDuck extends Duck {

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        super.setFlyBehavior(flyBehavior);
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        super.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}
