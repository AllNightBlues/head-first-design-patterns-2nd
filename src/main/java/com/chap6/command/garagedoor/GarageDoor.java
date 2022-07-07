/**
 * @(#) GarageDoor.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command.garagedoor;

/**
 * @ClassName GarageDoor
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:19
 * @Version 1.0
 **/
public class GarageDoor {

    public void up() {
        System.out.println("garage door is up");
    }

    public void down() {
        System.out.println("garage door is down");
    }

    public void stop() {
        System.out.println("garage door is stopped");
    }

    public void lightOn() {
        System.out.println("garage door light is on");
    }

    public void lightOff() {
        System.out.println("garage door light is off");
    }
}
