/**
 * @(#) ChicagoStyleCheesePizza.java 1.0 2022-06-21
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework.pizza.chicagopizza;

import com.chap4.pizzastoreframework.pizza.Pizza;

/**
 * @ClassName ChicagoStyleCheesePizza
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/21 22:29
 * @Version 1.0
 **/
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
