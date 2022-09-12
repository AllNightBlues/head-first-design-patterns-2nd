/**
 * @(#) Flock.java 1.0 2022-09-10
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Flock
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/10 15:09
 * @Version 1.0
 **/
public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<Quackable>();


    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }
}
