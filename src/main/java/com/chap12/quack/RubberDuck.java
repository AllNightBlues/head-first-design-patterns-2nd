/**
 * @(#) RubberDuck.java 1.0 2022-09-05
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName RubberDuck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/05 19:26
 * @Version 1.0
 **/
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
