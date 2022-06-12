/**
 * @(#) CurrentConditionDisplay.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp.display.impl;

import com.chap2.observerpattern.Observer;
import com.chap2.weathermonitoringapp.WeatherData;
import com.chap2.weathermonitoringapp.display.DisplayElement;

/**
 * @ClassName CurrentConditionDisplay
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:22
 * @Version 1.0
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity +"% humidity");
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
        this.humidity = weatherData.getHumidity();
        this.display();
    }
}
