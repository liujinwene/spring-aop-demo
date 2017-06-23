package com.duoduo.order.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;


@Aspect
@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public void listOrder() {
		System.out.println("in listOrder");
	}
	

}
