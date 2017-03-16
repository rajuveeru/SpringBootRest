package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomExceptions.OrderNotFoundException;

@RestController
public class SpringRestController {
	
	@Autowired
	private OrderRepository repository;
	
	@CrossOrigin
	@RequestMapping("/reports")
	public Reports getReports() throws OrderNotFoundException
	{
		/*Set<Order> orders = new HashSet<>();
		orders.add(new Order(2151, "Completed", "03/10/2017", new Float(39.58)));
		orders.add(new Order(2152, "Completed", "03/10/2017", new Float(39.58)));
		orders.add(new Order(897556, "Hold", "02/28/2017", new Float(09.25)));
		orders.add(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
		orders.add(new Order(98, "Completed", "01/25/2017", new Float(2.87)));
		orders.add(new Order(54826, "Pending", "03/05/2017", new Float(56.23)));
		Reports reps = new Reports(orders);*/
		
		
		// save a couple of customers
		/*		this.repository.save(new Order(2151, "Completed", "03/10/2017", new Float(39.58)));
		this.repository.save(new Order(897556, "Hold", "02/28/2017", new Float(09.25)));
		
*/
		/*this.repository.save(new Order(54826, "Pending", "03/05/2017", new Float(56.23)));
		this.repository.save(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
		this.repository.save(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
		this.repository.save(new Order(98, "Completed", "01/25/2017", new Float(2.87)));*/
				// fetch all customers
				System.out.println("Orders found with findAll():");
				System.out.println("-------------------------------");
				/*for (Order order : this.repository.findAll()) {
					System.out.println(order);
				}*/
				
				if(this.repository.findAll() == null || this.repository.findAll().isEmpty()){
					SpringRestApplication.log.error("Orders are not found");
					throw new OrderNotFoundException("Orders are not present in DB");
				}
				SpringRestApplication.log.error("Orders found with findAll():"+this.repository.findAll());
				Reports reps = new Reports(this.repository.findAll());
				return reps;
	}
	
	@RequestMapping("/save")
	public void saveOrders(){
		
	}

}
