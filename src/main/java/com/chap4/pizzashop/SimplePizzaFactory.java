/**
 * @(#) SimplePizzaFactory.java 1.0 2022-06-20
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzashop;

import com.chap4.pizzashop.pizza.CheesePizza;
import com.chap4.pizzashop.pizza.ClamPizza;
import com.chap4.pizzashop.pizza.PepperroniPizza;

/**
 * @ClassName SimplePizzaFactory
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/20 21:50
 * @Version 1.0
 **/
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperroniPizza();
        } else if (type.equals("clam")) {
            pizza=  new ClamPizza();
        }
        return pizza;
    }
}
