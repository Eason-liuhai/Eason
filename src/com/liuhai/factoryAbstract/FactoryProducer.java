package com.liuhai.factoryAbstract;
//工厂生成器
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		 if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
		}
}
