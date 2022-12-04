package com.dondapati.learn.controllers;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dondapati.learn.services.SimpleRestService;


@ExtendWith(MockitoExtension.class)
class SimpleRestControllerTest {
	
	@InjectMocks
	SimpleRestController simpleRestController;
	
	@Mock
	SimpleRestService simpleRestService;
	
	@BeforeEach
	public void init() {
		simpleRestController = new SimpleRestController(simpleRestService);
	}
	
	@Test
	void getOrder() {
		simpleRestController.getOrder("1");
		verify(simpleRestService).getOrderDetails("1");
	}

}
