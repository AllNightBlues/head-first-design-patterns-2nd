/**
 * @(#) Observer.java 1.0 2022-09-11
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName Observer
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/11 10:43
 * @Version 1.0
 **/
public interface Observer {

    void update(QuackObservable duck);
}
