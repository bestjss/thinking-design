package com.litchi.strategy;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是吱吱叫");
    }
}
