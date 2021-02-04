package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 调料1 牛奶
 */
public class MilkDecorator extends CondimentDecorator {

    Beverage beverage;

    /**
     * 装饰饮料 传入被装饰对象
     * @param beverage
     */
    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk 牛奶 $0.5 ";
    }

    @Override
    Double cost() {
        return this.beverage.cost() + 0.5;
    }
}
