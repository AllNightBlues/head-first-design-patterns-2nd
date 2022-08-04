/**
 * @(#) MallardDuck.java 1.0 2022-07-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap7.turkeyadapter;

/**
 * @ClassName MallardDuck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/14 21:06
 * @Version 1.0
 **/
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
