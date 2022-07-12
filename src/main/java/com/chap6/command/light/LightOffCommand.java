/**
 * @(#) LightOnCommand.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command.light;

import com.chap6.command.Command;

/**
 * @ClassName LightOffCommand
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:06
 * @Version 1.0
 **/
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
