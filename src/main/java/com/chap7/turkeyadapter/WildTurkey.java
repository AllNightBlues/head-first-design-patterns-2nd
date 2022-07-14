/**
 * @(#) WildTurkey.java 1.0 2022-07-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap7.turkeyadapter;

/**
 * @ClassName WildTurkey
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/14 21:07
 * @Version 1.0
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
