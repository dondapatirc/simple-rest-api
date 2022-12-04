package com.dondapati.learn.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dondapati.learn.dtos.OrderDTO;


@ExtendWith(MockitoExtension.class)
class SimpleRestServiceImplTest {
	
	@InjectMocks	
	private SimpleRestServiceImpl simpleRestService;
	
	
	@Test
	void getOrderDetails() {
		
		OrderDTO order = simpleRestService.getOrderDetails("1");
		
		assertEquals("1", order.getOrderId());
	}
	
	@Test
	void mapToDTO() {
		OrderDTO order = simpleRestService.mapToDTO();
		
		assertEquals("1", order.getOrderId());
	}
	
}
