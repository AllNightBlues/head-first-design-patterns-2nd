/**
 * @(#) GooseAdapter.java 1.0 2022-09-05
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap12.quack;

/**
 * @ClassName GooseAdapter
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/05 19:41
 * @Version 1.0
 **/
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
