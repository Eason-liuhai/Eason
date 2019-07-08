package com.liuhai.builder;

public class BuilderPatterDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		
		Meal vegMeal =mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		
		vegMeal.showItems();
		System.out.println("Total Cost:"+vegMeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
	    nonVegMeal.showItems();
	    System.out.println("Total Cost: " +nonVegMeal.getCost());
	}
}
