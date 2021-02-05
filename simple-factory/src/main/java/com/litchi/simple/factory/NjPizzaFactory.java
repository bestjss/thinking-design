package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class NjPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("CheesePizza")) {
            pizza = new CheesePizza();
            pizza.setName("NJ CheesePizza");
        } else if (type.equals("PepperoniPizza")) {
            pizza = new PepperoniPizza();
            pizza.setName("NJ PepperoniPizza");
        }
        return pizza;
    }
}