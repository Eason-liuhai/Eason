package com.liuhai.factory;


//����ģʽ
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//��ȡCircle����,����������draw����
		Shape shape1=shapeFactory.getShape("CIRCLE");
		//����Circle��draw����
		shape1.draw();
		//��ȡRectangle����,����������draw����
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		//����Rectangle��draw����
		shape2.draw();
		//��ȡSquare����,����������draw����
		Shape shape3=shapeFactory.getShape("SQUARE");
		//����Square��draw����
		shape3.draw();
	}
}
