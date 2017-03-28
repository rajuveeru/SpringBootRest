package com.infy;

import org.springframework.data.annotation.Id;

public class Order {
	@Id
	long order_id;
	String status;
	String date_placed;
	float price;
	
	public Order(long order_id,String status,String date_placed,float price)
	{
		this.order_id = order_id;
		this.status = status;
		this.date_placed = date_placed;
		this.price = price;
	}
	
	
}
