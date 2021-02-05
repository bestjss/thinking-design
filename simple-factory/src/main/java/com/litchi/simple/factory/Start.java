package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class Start {
    public static void main(String[] args) {
        PizzaFactory factoryNj = new NjPizzaFactory();
        PizzaFactory factoryNy = new NyPizzaFactory();
        // NJ 商店购买 NJ pizza
        System.out.println("-- NJ 商店购买 NJ pizza --");
        PizzaStore storeNj = new NjPizzaStore(factoryNj);
        storeNj.orderPizza("PepperoniPizza");
        // NY 商店购买 NJ pizza
        System.out.println("-- NY 商店购买 NJ pizza --");
        PizzaStore storeNy = new NyPizzaStore(factoryNy);
        storeNy.orderPizza("CheesePizza");
        // NJ 商店 购买NY pizza
        System.out.println("-- NJ 商店 购买NY pizza --");
        storeNj = new NjPizzaStore(factoryNy);
        storeNj.orderPizza("CheesePizza");
        // NY 商店 购买NJ pizza
        System.out.println("-- NY 商店 购买NJ pizza --");
        storeNy = new NyPizzaStore(factoryNj);
        storeNy.orderPizza("PepperoniPizza");
    }
}