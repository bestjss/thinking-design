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

    public void createPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}