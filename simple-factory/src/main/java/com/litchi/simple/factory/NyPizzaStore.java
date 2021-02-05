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
    public Pizza orderPizza(String type) {
        return pizzaFactory.createPizza(type);
    }
}