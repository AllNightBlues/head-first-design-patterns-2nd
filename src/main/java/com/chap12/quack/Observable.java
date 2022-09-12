/**
 * @(#) Observable.java 1.0 2022-09-11
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Observable
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/11 16:58
 * @Version 1.0
 **/
public class Observable implements QuackObservable {

    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
