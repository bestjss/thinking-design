package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 咖啡1
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend 咖啡1 $1.3";
    }

    @Override
    public Double cost() {
        // 价格1.3元
        return 1.3;
    }
}
