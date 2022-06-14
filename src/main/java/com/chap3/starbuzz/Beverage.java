/**
 * @(#) Beverage.java 1.0 2022-06-12
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.starbuzz;

/**
 * @ClassName Beverage
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/12 10:57
 * @Version 1.0
 **/
public abstract class Beverage {

    protected String description = "Unknown beverage";

    public enum Size {TALL, GRANDE, VENTI};

    protected Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}
