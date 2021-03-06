package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 绿头鸭
 */
public class MallardDuck extends Duck {

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
        System.out.println("我是绿头鸭");
    }
}
