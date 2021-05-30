package com.sharyu.designpatterns.builder.service.impl;

import com.sharyu.designpatterns.builder.service.Item;
import com.sharyu.designpatterns.builder.service.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

}
