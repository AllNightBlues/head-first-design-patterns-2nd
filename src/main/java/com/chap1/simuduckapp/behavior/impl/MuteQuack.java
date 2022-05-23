
package com.chap1.simuduckapp.behavior.impl;

import com.chap1.simuduckapp.behavior.QuackBehavior;

/**
 * @ClassName MuteQuack
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:12
 * @Version 1.0
 **/
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.printf("Keep silence");
    }
}
