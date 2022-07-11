/**
 * @(#) RemoteControlTest.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command;

import com.chap6.command.garagedoor.GarageDoor;
import com.chap6.command.garagedoor.GarageDoorOpenCommand;
import com.chap6.command.light.Light;
import com.chap6.command.light.LightOnCommand;

/**
 * @ClassName RemoteControlTest
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:14
 * @Version 1.0
 **/
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("garage door");
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
