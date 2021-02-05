package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class NjPizzaStore extends PizzaStore {

    public NjPizzaStore(PizzaFactory pizzaFactory){
        super(pizzaFactory);
    }

    @Override
    public Pizza orderPizza(String type) {
       return pizzaFactory.createPizza(type);
    }
}