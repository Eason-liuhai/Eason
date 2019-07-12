package com.liuhai.template;

//Ä£°åÄ£Ê½
public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game game=new Cricket();
		game.play();
		System.out.println();
		game=new Football();
		game.play();
	}
}
