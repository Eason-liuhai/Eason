package com.liuhai.visitor;

//访问者模式
public class VisitorPattrenDemo {
	public static void main(String[] args) {
		ComputerPart computer=new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
