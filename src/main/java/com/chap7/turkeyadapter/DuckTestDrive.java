/**
 * @(#) DuckTestDrive.java 1.0 2022-07-14
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap7.turkeyadapter;

/**
 * @ClassName DuckTestDrive
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/07/14 21:10
 * @Version 1.0
 **/
public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
