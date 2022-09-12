/**
 * @(#) MallardDuck.java 1.0 2022-09-05
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName MallardDuck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/05 19:23
 * @Version 1.0
 **/
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
