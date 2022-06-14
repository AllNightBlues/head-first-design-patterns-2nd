/**
 * @(#) Soy.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz.condiment;

import com.chap3.starbuzz.Beverage;
import com.chap3.starbuzz.CondimentDecorator;

/**
 * @ClassName Soy
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 21:42
 * @Version 1.0
 **/
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (beverage.getSize()) {
            case TALL:
                cost = .10;
                break;
            case GRANDE:
                cost = .15;
                break;
            case VENTI:
                cost = .20;
                break;
            default:
                cost = .10;
        }
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
