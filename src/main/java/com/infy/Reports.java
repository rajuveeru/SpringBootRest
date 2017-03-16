package com.infy;

import java.util.List;
import java.util.Set;

public class Reports {
	
	Set<Order> orders;
	List<Order> str;
	
	public Reports(Set<Order> orders)
	{
		this.orders = orders;
	}
	
	public Reports(List<Order> str)
	{
		this.str = str;
	}

	/*public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}*/
	
	public List<Order> getOrders() {
		return str;
	}

	public void setOrders(List<Order> orders) {
		this.str = str;
	}

	
	
}
