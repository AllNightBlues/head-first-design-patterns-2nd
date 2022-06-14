/**
 * @(#) CondimentDecorator.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz;

/**
 * @ClassName CondimentDecorator
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 21:08
 * @Version 1.0
 **/
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
}
