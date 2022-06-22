/**
 * @(#) PizzaTestDrive.java 1.0 2022-06-21
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework;

import com.chap4.pizzastoreframework.pizza.Pizza;
import com.chap4.pizzastoreframework.store.ChicagoPizzaStore;
import com.chap4.pizzastoreframework.store.NYStylePizzaStore;

/**
 * @ClassName PizzaTestDrive
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/21 22:30
 * @Version 1.0
 **/
public class PizzaTestDrive {

    public static void main(String[] args) {
        NYStylePizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
