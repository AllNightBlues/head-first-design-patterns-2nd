
package com.chap1.simuduckapp.duck;

import com.chap1.simuduckapp.behavior.impl.FlyNoWay;
import com.chap1.simuduckapp.behavior.impl.Quack;

/**
 * @ClassName ModelDuck
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:15
 * @Version 1.0
 **/
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Displaying ModelDuck");
    }
}
