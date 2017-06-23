package com.duoduo.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.duoduo.CoreServerApp;
import com.duoduo.order.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreServerApp.class)
@WebAppConfiguration
public class CommonTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test() {
		orderService.listOrder();
	}

}
