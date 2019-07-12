package com.liuhai.factory;


//工厂模式
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//获取Circle对象,并调用它的draw方法
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//调用Circle的draw方法
		shape1.draw();
		//获取Rectangle对象,并调用它的draw方法
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		//调用Rectangle的draw方法
		shape2.draw();
		//获取Square对象,并调用它的draw方法
		Shape shape3=shapeFactory.getShape("SQUARE");
		//调用Square的draw方法
		shape3.draw();
	}
}
