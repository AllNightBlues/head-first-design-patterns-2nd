/**
 * @(#) NYPizzaIngredientFactory.java 1.0 2022-06-28
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap4.pizzaaf.factory;

import com.chap4.pizzaaf.*;
import com.chap4.pizzaaf.cheese.ReggianoCheese;
import com.chap4.pizzaaf.clams.FreshClams;
import com.chap4.pizzaaf.dough.ThinCrustDough;
import com.chap4.pizzaaf.pepperoni.SlicedPepperoni;
import com.chap4.pizzaaf.sauce.MarinaraSauce;
import com.chap4.pizzaaf.veggies.Garlic;
import com.chap4.pizzaaf.veggies.Mushroom;
import com.chap4.pizzaaf.veggies.Onion;
import com.chap4.pizzaaf.veggies.RedPepper;

/**
 * @ClassName NYPizzaIngredientFactory
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/06/28 22:04
 * @Version 1.0
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
