package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 调味品装饰类
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
