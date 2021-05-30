package com.sharyu.designpatterns.builder.service.impl;

import com.sharyu.designpatterns.builder.service.Item;
import com.sharyu.designpatterns.builder.service.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
