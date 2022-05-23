
package com.chap1.simuduckapp.behavior.impl;

import com.chap1.simuduckapp.behavior.FlyBehavior;

/**
 * @ClassName FlyNoWay
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:11
 * @Version 1.0
 **/
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly!");
    }
}
