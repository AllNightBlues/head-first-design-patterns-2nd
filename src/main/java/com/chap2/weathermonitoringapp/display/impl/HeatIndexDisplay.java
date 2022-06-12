/**
 * @(#) HeatIndexDisplay.java 1.0 2022-06-08
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp.display.impl;

import com.chap2.observerpattern.Observer;
import com.chap2.weathermonitoringapp.WeatherData;
import com.chap2.weathermonitoringapp.display.DisplayElement;

/**
 * @ClassName HeatIndexDisplay
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/08 23:44
 * @Version 1.0
 **/
public class HeatIndexDisplay implements Observer,DisplayElement {

    private float temperature;

    private float humidity;

    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity =weatherData.getHumidity();
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + computeHeatIndex(this.temperature, this.humidity));
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
