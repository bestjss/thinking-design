package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public abstract class PizzaStore {

    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void createPizza(String type) {
        Pizza pizza =orderPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza orderPizza(String type);
}