package com.dondapati.learn.services;

import com.dondapati.learn.dtos.OrderDTO;

public interface SimpleRestService {
	
	public OrderDTO getOrderDetails(String orderId);

}
