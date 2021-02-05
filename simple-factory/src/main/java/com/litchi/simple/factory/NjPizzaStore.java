package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class NjPizzaStore extends PizzaStore {

    public NjPizzaStore(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public Pizza createPizza(String type) {
        System.out.println("NJ 开始制作 " + type);
        return pizzaFactory.createPizza(type);
    }
}