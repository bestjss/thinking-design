package com.litchi.decorator;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description Start
 */
public class Start {
    /**
     * 下一个订单
     * @param args
     */
    public static void main(String[] args) {
        // 购买DarkRoast + Milk
        Beverage beverageDark = new DarkRoast();
        Beverage beverageMilk = new MilkDecorator(beverageDark);
        System.out.println(beverageMilk.getDescription() + "$" + beverageMilk.cost());
        // 购买DarkRoast + Milk + Mocha
        Beverage beverageMocha = new MochaDecorator(beverageMilk);
        System.out.println(beverageMocha.getDescription() + "$" + beverageMocha.cost());

        // 购买HouseBlend + soy + whip
        Beverage beverageHouseBlend = new HouseBlend();
        Beverage beverageSoy = new SoyDecorator(beverageHouseBlend);
        Beverage beverageWhip = new WhipDecorator(beverageSoy);
        System.out.println(beverageWhip.getDescription() + "$" + beverageWhip.cost());
    }
}
