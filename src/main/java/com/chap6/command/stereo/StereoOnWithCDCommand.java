/**
 * @(#) StereoOnWithCDCommand.java 1.0 2022-07-07
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap6.command.stereo;

import com.chap6.command.Command;

/**
 * @ClassName StereoOnWithCDCommand
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/07 22:42
 * @Version 1.0
 **/
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
