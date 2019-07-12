package com.liuhai.singleton;


//单例模式
public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		//构造函数在编译时会出错，因为其是private
		//SingleObject object=new SingleObject();
		
		//获取唯一可用的对象
		SingleObject object=SingleObject.getInstance();
		//显示信息
		object.showMessage();
	}
}
