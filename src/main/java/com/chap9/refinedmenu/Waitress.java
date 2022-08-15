/**
 * @(#) Waitress.java 1.0 2022-08-09
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap9.refinedmenu;

import com.chap9.menu.Menu;
import com.chap9.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Waitress
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/08/09 21:24
 * @Version 1.0
 **/
public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterators = menus.iterator();
        while (menuIterators.hasNext()) {
            Menu menu = menuIterators.next();
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " == ");
            System.out.println(menuItem.getDescription());
        }
    }
}
