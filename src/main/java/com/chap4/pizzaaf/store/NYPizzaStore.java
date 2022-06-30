package com.chap4.pizzaaf.store;

import com.chap4.pizzaaf.Pizza;
import com.chap4.pizzaaf.PizzaIngredientFactory;
import com.chap4.pizzaaf.PizzaStore;
import com.chap4.pizzaaf.factory.NYPizzaIngredientFactory;
import com.chap4.pizzaaf.pizza.CheesePizza;
import com.chap4.pizzaaf.pizza.ClamPizza;
import com.chap4.pizzaaf.pizza.PepperoniPizza;
import com.chap4.pizzaaf.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
