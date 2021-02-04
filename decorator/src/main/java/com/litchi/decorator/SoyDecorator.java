package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 调料3  黄豆
 */
public class SoyDecorator extends CondimentDecorator{

    Beverage beverage;

    public SoyDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy 黄豆 $0.2 ";
    }

    @Override
    Double cost() {
        return this.beverage.cost() + 0.2;
    }
}
