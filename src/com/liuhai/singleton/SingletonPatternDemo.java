package com.liuhai.singleton;


//����ģʽ
public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		//���캯���ڱ���ʱ�������Ϊ����private
		//SingleObject object=new SingleObject();
		
		//��ȡΨһ���õĶ���
		SingleObject object=SingleObject.getInstance();
		//��ʾ��Ϣ
		object.showMessage();
	}
}
