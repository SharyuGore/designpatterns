package com.sharyu.designpatterns.builder.service;

import com.sharyu.designpatterns.builder.service.impl.ChickenBurger;
import com.sharyu.designpatterns.builder.service.impl.Coke;
import com.sharyu.designpatterns.builder.service.impl.Pepsi;
import com.sharyu.designpatterns.builder.service.impl.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
