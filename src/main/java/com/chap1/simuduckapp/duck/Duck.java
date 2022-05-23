
package com.chap1.simuduckapp.duck;

import com.chap1.simuduckapp.behavior.FlyBehavior;
import com.chap1.simuduckapp.behavior.QuackBehavior;

/**
 * @ClassName Duck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 14:55
 * @Version 1.0
 **/
public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks swim");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
