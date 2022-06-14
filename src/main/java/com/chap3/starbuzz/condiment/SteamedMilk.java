/**
 * @(#) SteamedMilk.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz.condiment;

import com.chap3.starbuzz.Beverage;
import com.chap3.starbuzz.CondimentDecorator;

/**
 * @ClassName SteamedMilk
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 21:43
 * @Version 1.0
 **/
public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
