/**
 * @(#) NYStylePizzaStore.java 1.0 2022-06-20
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework.store;

import com.chap4.pizzashop.Pizza;
import com.chap4.pizzastoreframework.PizzaStore;
import com.chap4.pizzastoreframework.pizza.nypizza.NYStyleCheesePizza;
import com.chap4.pizzastoreframework.pizza.nypizza.NYStyleClamPizza;
import com.chap4.pizzastoreframework.pizza.nypizza.NYStylePepperoniPizza;
import com.chap4.pizzastoreframework.pizza.nypizza.NYStyleVeggiePizza;

/**
 * @ClassName NYStylePizzaStore
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/20 22:28
 * @Version 1.0
 **/
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
