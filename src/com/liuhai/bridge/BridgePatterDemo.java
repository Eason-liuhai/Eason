package com.liuhai.bridge;


//ге╫сдёй╫
public class BridgePatterDemo {
	public static void main(String[] args) {
		Shape redCircle=new Circle(100,100,10,new RedCircle());
		Shape greenCircle=new Circle(100,100,10,new GreenCircle());
		
		redCircle.draw();
	    greenCircle.draw();
	}
}
