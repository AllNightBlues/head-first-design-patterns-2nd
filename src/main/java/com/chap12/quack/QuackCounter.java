/**
 * @(#) QuackCounter.java 1.0 2022-09-05
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName QuackCounter
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/05 19:45
 * @Version 1.0
 **/
public class QuackCounter implements Quackable {

    Quackable duck;
    static int nemberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        nemberOfQuacks++;
    }

    public static int getQuacks() {
        return nemberOfQuacks;
    }
}
