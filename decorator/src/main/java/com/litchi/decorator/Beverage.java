package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 抽象饮料
 */
public abstract class Beverage {


    String description = "";

    /**
     * 获取描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 花费
     *
     * @return
     */
    abstract Double cost();
}
