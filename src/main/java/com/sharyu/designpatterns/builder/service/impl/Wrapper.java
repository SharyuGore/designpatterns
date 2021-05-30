package com.sharyu.designpatterns.builder.service.impl;

import com.sharyu.designpatterns.builder.service.Packing;

public class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
}
