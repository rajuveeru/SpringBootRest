package com.infy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ReportsTest {

	Reports reportsInst;
	@Before
	public void setUp(  ) {
		List<Order> orders = new ArrayList<Order>();
		 reportsInst = new Reports(orders);
    }
	@Test
	public void testReports() {
		Set<Order> orders = new HashSet<Order>();
		Reports reportsInst = new Reports(orders);
	}

	@Test
	public void testGetOrders() {
		List<Order> orders = new ArrayList<Order>();
		reportsInst.setOrders(orders);
		reportsInst.getOrders();

	}

	@Test
	public void testSetOrders() {
		List<Order> orders = new ArrayList<Order>();
		reportsInst.setOrders(orders);
		
	}

}
