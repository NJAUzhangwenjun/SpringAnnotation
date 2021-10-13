package com.wjhub.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjhub.aop.MathCalculator;
import com.wjhub.bean.Boss;
import com.wjhub.bean.Car;
import com.wjhub.bean.Color;
import com.wjhub.bean.Red;
import com.wjhub.config.MainConfigOfAOP;
import com.wjhub.config.MainConifgOfAutowired;
import com.wjhub.dao.BookDao;
import com.wjhub.service.BookService;

public class IOCTest_AOP {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		
		//1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		
		mathCalculator.div(1, 0);
		
		applicationContext.close();
	}

}
