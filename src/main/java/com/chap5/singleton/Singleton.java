/**
 * @(#) Singleton.java 1.0 2022-07-05
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap5.singleton;

/**
 * @ClassName Singleton
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/05 21:43
 * @Version 1.0
 **/
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
