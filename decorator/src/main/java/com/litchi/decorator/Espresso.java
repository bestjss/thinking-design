package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 咖啡3
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso 咖啡3 $1.2 ";
    }

    @Override
    Double cost() {
        // 价格1.2元
        return 1.2;
    }
}
