package com.infy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderTest {

	Order orderInst;
	long order_id;
	String status;
	String date_placed;
	float price;
	@Before
	public void setUp(  ) {
		order_id = 2151;
		status =  "Completed";
		date_placed = "03/10/2017";
		price = new Float(39.58);
		orderInst = new Order(order_id, status, date_placed, price);
	}
	@Test
	public void testOrder() {
		
		orderInst = new Order(order_id, status, date_placed, price);
	}


}
