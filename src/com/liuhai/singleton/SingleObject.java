package com.liuhai.singleton;

public class SingleObject {
	//����SingleObject��һ������
	private static SingleObject instance= new SingleObject();
	
	//���캯��Ϊprivate,��Ͳ��ᱻʵ����
	private SingleObject() {}
	//��ȡΨһ�Ŀ��ö���
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
