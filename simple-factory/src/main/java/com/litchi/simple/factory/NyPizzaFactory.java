package com.litchi.simple.factory;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
public class NyPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("CheesePizza")) {
            pizza = new CheesePizza();
            pizza.setName("NY CheesePizza");
        } else if (type.equals("PepperoniPizza")) {
            pizza = new PepperoniPizza();
            pizza.setName("NY PepperoniPizza");
        }
        return pizza;
    }
}