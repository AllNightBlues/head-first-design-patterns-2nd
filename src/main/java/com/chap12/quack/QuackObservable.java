/**
 * @(#) QuackObservable.java 1.0 2022-09-10
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName QuackObservable
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/10 15:44
 * @Version 1.0
 **/
public interface QuackObservable {

    default void registerObserver(Observer observer) {

    }

    default void notifyObservers() {

    }
}
