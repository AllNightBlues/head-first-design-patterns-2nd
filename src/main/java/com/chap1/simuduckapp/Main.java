
package com.chap1.simuduckapp;

import com.chap1.simuduckapp.behavior.impl.FlyWithARocket;
import com.chap1.simuduckapp.duck.MallardDuck;
import com.chap1.simuduckapp.duck.ModelDuck;
import org.junit.Test;

/**
 * @ClassName Main
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:04
 * @Version 1.0
 **/
public class Main {

    @Test
    public void test() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithARocket());
        modelDuck.performFly();
    }
}
