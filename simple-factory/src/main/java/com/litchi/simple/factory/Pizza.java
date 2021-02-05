package com.litchi.simple.factory;

import lombok.Data;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description
 */
@Data
public class Pizza {
    private String name;

    public void prepare(){
        System.out.println(this.name + " prepared ");
    }

    public void bake(){
        System.out.println(this.name + " baked ");
    }

    public void cut(){
        System.out.println(this.name + " cut ");
    }

    public void box(){
        System.out.println(this.name + " boxed ");
    }
}