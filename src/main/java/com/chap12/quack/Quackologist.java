/**
 * @(#) Quackologist.java 1.0 2022-09-11
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName Quackologist
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/11 17:15
 * @Version 1.0
 **/
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
