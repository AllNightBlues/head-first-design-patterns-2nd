/**
 * @(#) Decaf.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz.beverage;

import com.chap3.starbuzz.Beverage;

/**
 * @ClassName Decaf
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 21:27
 * @Version 1.0
 **/
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
