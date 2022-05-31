/**
 * @(#) WeatherData.java 1.0 2022-05-29
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.weathermonitoringapp;

import com.chap2.observerpattern.Observer;
import com.chap2.observerpattern.Subject;
import com.chap2.weathermonitoringapp.display.impl.CurrentConditionDisplay;
import com.chap2.weathermonitoringapp.display.impl.ForecastDisplay;
import com.chap2.weathermonitoringapp.display.impl.StatisticsDisplay;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WeatherData
 * @description: weatherData
 * @AUTHOR AllNightBlues
 * @Date 2022/05/29 00:08
 * @Version 1.0
 **/
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {

        this.observers = new ArrayList<>();
    }


    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
