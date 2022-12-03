package com.dondapati.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dondapati.learn.dtos.OrderDTO;
import com.dondapati.learn.services.SimpleRestService;

@RestController
@RequestMapping("/api/v1")
public class SimpleRestController {
	
	@Autowired
	SimpleRestService simpleRestService;
	
		
	public SimpleRestController(SimpleRestService simpleRestService) {
		this.simpleRestService = simpleRestService;
	}


	@GetMapping(value = "/orders/{id}")
	public OrderDTO getOrder(@PathVariable String id) {
		return simpleRestService.getOrderDetails(id);
	}

}
