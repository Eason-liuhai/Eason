package com.liuhai.facade;


//外观模式
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker=new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectengle();
		shapeMaker.drawSquare();
	}
}
