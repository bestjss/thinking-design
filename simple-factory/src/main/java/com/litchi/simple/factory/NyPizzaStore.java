package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class NyPizzaStore extends PizzaStore {

    public NyPizzaStore(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public Pizza createPizza(String type) {
        System.out.println("NY 开始制作 " + type);
        return pizzaFactory.createPizza(type);
    }
}