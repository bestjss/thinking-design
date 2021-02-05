package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("CheesePizza")) {
            pizza = new CheesePizza();
        } else if (type.equals("PepperoniPizza")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}