/**
 * @(#) PizzaStore.java 1.0 2022-06-20
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework;

import com.chap4.pizzashop.Pizza;

/**
 * @ClassName PizzaStore
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/20 22:14
 * @Version 1.0
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
