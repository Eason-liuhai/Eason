package com.liuhai.composite;


//组合模式
public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee CEO=new Employee("老王","CEO",3000000);
		
		Employee headSales=new Employee("老袁","Head Sales",2000000);
		
		Employee headMarketing=new Employee("老李","Head Marketing",20000);
		
		Employee clerk1=new Employee("Laura","Marketing",100000);
		Employee clerk2=new Employee("Bob","Marketing",100000);
		
		Employee salesExecutive1=new Employee("Richard","Sales",10000);
		Employee salesExecutive2=new Employee("Rob","Sales",10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(CEO);
		for(Employee headEmployee:CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for(Employee employee:headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
		
	}
}
