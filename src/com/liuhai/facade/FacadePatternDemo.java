package com.liuhai.facade;


//���ģʽ
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker=new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectengle();
		shapeMaker.drawSquare();
	}
}
