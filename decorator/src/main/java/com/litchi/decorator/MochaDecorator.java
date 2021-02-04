package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 调料2 摩卡
 */
public class MochaDecorator extends CondimentDecorator {

    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha 摩卡 $0.3 ";
    }

    @Override
    Double cost() {
        return beverage.cost() + 0.3;
    }
}
