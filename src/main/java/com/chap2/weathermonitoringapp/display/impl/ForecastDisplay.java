/**
 * @(#) ForecastDisplay.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp.display.impl;

import com.chap2.observerpattern.Observer;
import com.chap2.weathermonitoringapp.display.DisplayElement;

/**
 * @ClassName ForecastDisplay
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:24
 * @Version 1.0
 **/
public class ForecastDisplay implements Observer, DisplayElement {


    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
