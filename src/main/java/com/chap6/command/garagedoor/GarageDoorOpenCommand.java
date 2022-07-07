/**
 * @(#) GarageDoorCommand.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command.garagedoor;

import com.chap6.command.Command;

/**
 * @ClassName GarageDoorCommand
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 21:21
 * @Version 1.0
 **/
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
