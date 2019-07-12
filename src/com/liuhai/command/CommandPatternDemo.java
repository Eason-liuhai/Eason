package com.liuhai.command;

//命令模式
//用Broker类来接受执行命令
public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock=new Stock();
		
		BuyStock buyStockOrder=new BuyStock(abcStock);
		
		SellStock sellStockOrder=new SellStock(abcStock);
		
		Broker broker=new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.planceOrders();
	}
}
