/**
 * @(#) StarbuzzCoffee.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz;

import com.chap3.starbuzz.beverage.DarkRoast;
import com.chap3.starbuzz.beverage.Espresso;
import com.chap3.starbuzz.beverage.HouseBlend;
import com.chap3.starbuzz.condiment.Mocha;
import com.chap3.starbuzz.condiment.Soy;
import com.chap3.starbuzz.condiment.Whip;

/**
 * @ClassName StarbuzzCoffee
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 21:46
 * @Version 1.0
 **/
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
