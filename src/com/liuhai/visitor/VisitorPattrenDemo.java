package com.liuhai.visitor;

//������ģʽ
public class VisitorPattrenDemo {
	public static void main(String[] args) {
		ComputerPart computer=new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
