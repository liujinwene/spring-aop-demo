package com.duoduo.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/listByCd")
	public String listByCd() {
		return "1,2,3,4,5";
	}

}
