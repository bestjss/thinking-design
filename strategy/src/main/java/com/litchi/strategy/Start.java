package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description Start
 */
public class Start {
    public static void main(String[] args) {
        /**
         * 绿头鸭
         */
        Duck duckM = new MallardDuck();
        duckM.setFlyBehavior(new FlyWithWings());
        duckM.setQuackBehavior(new Quack());
        duckM.display();
        duckM.performFly();
        duckM.performQuack();
        System.out.println("------");
        /**
         * 红头鸭子
         */
        Duck duckR = new RedheadDuck();
        duckR.setFlyBehavior(new FlyWithWings());
        duckR.setQuackBehavior(new Squeak());
        duckR.display();
        duckR.performFly();
        duckR.performQuack();
        System.out.println("------");
        /**
         * 橡皮鸭子
         */
        Duck duckB = new RubberDuck();
        duckB.setFlyBehavior(new FlyNoWay());
        duckB.setQuackBehavior(new Squeak());
        duckB.display();
        duckB.performFly();
        duckB.performQuack();
    }
}
