/**
 * @(#) CaffeineBeverage.java 1.0 2022-08-06
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap8.caffeinebeverage;

/**
 * @ClassName CaffeineBeverage
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/08/06 10:15
 * @Version 1.0
 **/
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
