package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 咖啡4
 */
public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf 咖啡4 $2.0 ";
    }

    @Override
    Double cost() {
        // 价格2.0元
        return 2.0;
    }
}
