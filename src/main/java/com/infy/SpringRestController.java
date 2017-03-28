package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomExceptions.OrderNotFoundException;

@RestController
public class SpringRestController {
	
	@Autowired
	private OrderRepository repository;
	
	@CrossOrigin
	@RequestMapping("/reports")
	@ExceptionHandler(OrderNotFoundException.class)
	public Reports getReports() 
	{
				if(this.repository.findAll() == null || this.repository.findAll().isEmpty()){
					/*this.repository.save(new Order(54826, "Pending", "03/05/2017", new Float(56.23)));
					this.repository.save(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
					this.repository.save(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
					this.repository.save(new Order(98, "Completed", "01/25/2017", new Float(2.87)));*/
				}
				SpringRestApplication.log.error("Orders found with findAll():"+this.repository.findAll());
				Reports reps = new Reports(this.repository.findAll());
				return reps;
	}
	
	@RequestMapping("/save")
	public void saveOrders(){
		
	}

}
