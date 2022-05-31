/**
 * @(#) Subject.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.observerpattern;

/**
 * @ClassName Subject
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:58
 * @Version 1.0
 **/
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
