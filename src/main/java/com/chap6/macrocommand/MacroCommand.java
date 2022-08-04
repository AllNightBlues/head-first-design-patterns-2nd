
 /**
   * @(#) MacroCommand.java 1.0 2022-07-12
   * Copyright (c) 2022, AllNightBlues. ALL right reserved.
   * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
   */
package com.chap6.macrocommand;

 import com.chap6.command.Command;

 /**
 * @ClassName MacroCommand
 * @description: With this command you can operate multiple devices with a single trigger
 * @AUTHOR AllNightBlues
 * @Date 2022/07/12 22:37
 * @Version 1.0
 **/
public class MacroCommand implements Command {

    Command[] commands;

     public MacroCommand(Command[] commands) {
         this.commands = commands;
     }

     @Override
     public void execute() {
         for (int i = 0; i < commands.length; i++) {
             commands[i].execute();
         }
     }

 }
