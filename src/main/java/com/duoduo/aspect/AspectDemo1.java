package com.duoduo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo1 {
	@Pointcut("within(com.duoduo.order..*)")
	public void test() {
		System.out.println("in AspectDemo1.test");
	}
}
