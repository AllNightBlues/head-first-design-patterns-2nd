/**
 * @(#) PizzaShop.java 1.0 2022-06-20
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzashop;

/**
 * @ClassName PizzaStore
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/20 21:40
 * @Version 1.0
 **/
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
