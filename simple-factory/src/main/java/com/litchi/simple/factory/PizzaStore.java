package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class PizzaStore {

    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void cook(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        System.out.println(pizza.getName() + "已制作完成");
    }
}