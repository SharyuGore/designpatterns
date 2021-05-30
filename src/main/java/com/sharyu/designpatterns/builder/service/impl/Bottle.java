package com.sharyu.designpatterns.builder.service.impl;

import com.sharyu.designpatterns.builder.service.Packing;

public class Bottle implements Packing {
	@Override
	public String pack() {
		return "Bottle";
	}
}
