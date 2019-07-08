package com.liuhai.builder;

//扩展Burger和ColdDrink实体类
public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
	
}
