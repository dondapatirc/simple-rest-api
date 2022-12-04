package com.dondapati.learn.services;

import org.springframework.stereotype.Service;

import com.dondapati.learn.dtos.OrderDTO;

@Service
public class SimpleRestServiceImpl implements SimpleRestService{
	
		
	@Override	
	public OrderDTO getOrderDetails(String orderId) {
		return mapToDTO();
	}
	
	public OrderDTO mapToDTO() {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId("1");
		orderDTO.setOrderName("OrderName1");
		return orderDTO;
	}

}
