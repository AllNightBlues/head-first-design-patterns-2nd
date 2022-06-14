/**
 * @(#) DarkRoasr.java 1.0 2022-06-13
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz.beverage;

import com.chap3.starbuzz.Beverage;

/**
 * @ClassName DarkRoast
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/13 22:49
 * @Version 1.0
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
