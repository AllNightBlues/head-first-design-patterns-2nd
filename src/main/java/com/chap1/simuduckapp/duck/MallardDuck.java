
package com.chap1.simuduckapp.duck;

import com.chap1.simuduckapp.behavior.impl.FlyWithWings;
import com.chap1.simuduckapp.behavior.impl.Quack;

/**
 * @ClassName MallardDuck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 14:59
 * @Version 1.0
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Displaying MallardDuck!");
    }
}
