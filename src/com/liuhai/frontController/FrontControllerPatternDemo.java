package com.liuhai.frontController;


//ǰ�˿�����ģʽ
public class FrontControllerPatternDemo {
	   public static void main(String[] args) {
	      FrontController frontController = new FrontController();
	      frontController.dispatchRequest("HOME");
	      frontController.dispatchRequest("STUDENT");
	   }
	}
