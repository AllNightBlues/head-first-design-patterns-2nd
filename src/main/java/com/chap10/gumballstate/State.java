/**
 * @(#) State.java 1.0 2022-08-19
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap10.gumballstate;

/**
 * @ClassName State
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/08/19 22:38
 * @Version 1.0
 **/
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    public void refill();


}
