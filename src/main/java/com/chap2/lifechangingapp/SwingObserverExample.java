/**
 * @(#) SwingObserverExample.java 1.0 2022-06-11
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap2.lifechangingapp;

import java.awt.*;
import javax.swing.*;

/**
 * @ClassName SwingObserverExample
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/11 21:47
 * @Version 1.0
 **/
public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> {
            System.out.println("Don't do it, you might regret it!");
        });
        button.addActionListener(event -> {
            System.out.println("Come on, do it!");
        });

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

/*    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }*/
}
