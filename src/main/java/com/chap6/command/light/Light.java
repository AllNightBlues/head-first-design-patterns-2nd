/**
 * @(#) Light.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command.light;

/**
 * @ClassName Light
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:07
 * @Version 1.0
 **/
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
