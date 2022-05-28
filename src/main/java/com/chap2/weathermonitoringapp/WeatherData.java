/**
 * @(#) WeatherData.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp;

import com.chap2.weathermonitoringapp.display.impl.CurrentConditionDisplay;
import com.chap2.weathermonitoringapp.display.impl.ForecastDisplay;
import com.chap2.weathermonitoringapp.display.impl.StatisticsDisplay;

/**
 * @ClassName WeatherData
 * @description: weatherData
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:08
 * @Version 1.0
 **/
public class WeatherData {

    private CurrentConditionDisplay currentConditionDisplay;

    private StatisticsDisplay statisticsDisplay;

    private ForecastDisplay forecastDisplay;

    public WeatherData() {
        this.currentConditionDisplay = new CurrentConditionDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }

    public float getTemprature() {
        return 1f;
    }

    public float getHumidity() {
        return 1f;
    }

    public float getPressure() {
        return 1f;
    }

    public void measurementsChanged() {
        float temp = this.getTemprature();
        float humidity = this.getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
