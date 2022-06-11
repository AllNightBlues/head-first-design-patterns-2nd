/**
 * @(#) WeatherStation.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp;

import com.chap2.weathermonitoringapp.display.impl.CurrentConditionDisplay;
import com.chap2.weathermonitoringapp.display.impl.HeatIndexDisplay;

/**
 * @ClassName WeatherStation
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:25
 * @Version 1.0
 **/
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(90, 20, 30.4f);
        weatherData.setMeasurements(78, 15, 29.2f);
        weatherData.setMeasurements(55, 88, 30.2f);


    }
}
