package com.liuhai.factoryAbstract;

public class ShapeFactory extends AbstractFactory{
	//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
