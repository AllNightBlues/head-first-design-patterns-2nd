/**
 * @(#) SimpleRemoteControl.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command;

/**
 * @ClassName SimpleRemoteControl
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:13
 * @Version 1.0
 **/
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
