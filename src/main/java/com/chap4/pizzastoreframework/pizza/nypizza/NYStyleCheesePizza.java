/**
 * @(#) NYStyleCheesePizza.java 1.0 2022-06-20
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzastoreframework.pizza.nypizza;


import com.chap4.pizzastoreframework.pizza.Pizza;

/**
 * @ClassName NYStyleCheesePizza
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/20 22:37
 * @Version 1.0
 **/
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
