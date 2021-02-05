package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class Start {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.cook("CheesePizza");
        store.cook("PepperoniPizza");
    }
}