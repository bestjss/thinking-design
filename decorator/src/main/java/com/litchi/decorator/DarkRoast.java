package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 咖啡2
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast 咖啡2 $1.1 ";
    }

    @Override
    Double cost() {
        // 价格 1.1元
        return 1.1;
    }
}
