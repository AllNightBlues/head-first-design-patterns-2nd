/**
 * @(#) PizzaIngredientFactory.java 1.0 2022-06-28
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzaaf;

/**
 * @ClassName PizzaIngredientFactory
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/28 22:01
 * @Version 1.0
 **/
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
