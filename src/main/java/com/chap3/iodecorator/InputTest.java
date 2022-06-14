/**
 * @(#) InputTest.java 1.0 2022-06-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap3.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @ClassName InputTest
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/14 23:08
 * @Version 1.0
 **/
public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("D:\\code\\head-first-design-patterns-2nd\\src\\main\\resources\\test.txt")));
            while((c = in.read()) >=0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
