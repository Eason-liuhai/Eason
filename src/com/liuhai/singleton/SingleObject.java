package com.liuhai.singleton;

public class SingleObject {
	//创建SingleObject的一个对象
	private static SingleObject instance= new SingleObject();
	
	//构造函数为private,类就不会被实例化
	private SingleObject() {}
	//获取唯一的可用对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
