package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 调料4 奶泡
 */
public class WhipDecorator extends CondimentDecorator {

    Beverage beverage;

    public WhipDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip 奶泡 $0.7 ";
    }

    @Override
    Double cost() {
        return this.beverage.cost() + 0.7;
    }
}
