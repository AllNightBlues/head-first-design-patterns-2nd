/**
 * @(#) ChicagoPizzaStore.java 1.0 2022-06-21
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework.store;

import com.chap4.pizzastoreframework.PizzaStore;
import com.chap4.pizzastoreframework.pizza.Pizza;
import com.chap4.pizzastoreframework.pizza.chicagopizza.ChicagoStyleCheesePizza;
import com.chap4.pizzastoreframework.pizza.chicagopizza.ChicagoStyleClamPizza;
import com.chap4.pizzastoreframework.pizza.chicagopizza.ChicagoStylePepperoniPizza;
import com.chap4.pizzastoreframework.pizza.chicagopizza.ChicagoStyleVeggiePizza;

/**
 * @ClassName ChicagoPizzaStore
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/21 22:31
 * @Version 1.0
 **/
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
