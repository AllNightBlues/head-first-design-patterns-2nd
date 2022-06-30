/**
 * @(#) ChicagoPizzaIngredientFactory.java 1.0 2022-06-28
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzaaf.factory;

import com.chap4.pizzaaf.*;
import com.chap4.pizzaaf.cheese.MozzarellaCheese;
import com.chap4.pizzaaf.clams.FrozenClams;
import com.chap4.pizzaaf.dough.ThickCrustDough;
import com.chap4.pizzaaf.pepperoni.SlicedPepperoni;
import com.chap4.pizzaaf.sauce.PlumTomatoSauce;
import com.chap4.pizzaaf.veggies.BlackOlives;
import com.chap4.pizzaaf.veggies.Eggplant;
import com.chap4.pizzaaf.veggies.Spinach;

/**
 * @ClassName ChicagoPizzaIngredientFactory
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/28 22:10
 * @Version 1.0
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
