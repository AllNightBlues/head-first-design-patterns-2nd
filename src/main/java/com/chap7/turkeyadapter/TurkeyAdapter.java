/**
 * @(#) TurkeyAdapter.java 1.0 2022-07-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap7.turkeyadapter;

/**
 * @ClassName TurkeyAdapter
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/14 21:09
 * @Version 1.0
 **/
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
