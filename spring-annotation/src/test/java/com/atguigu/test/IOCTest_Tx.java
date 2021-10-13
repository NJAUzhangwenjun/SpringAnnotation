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
import com.wjhub.tx.TxConfig;
import com.wjhub.tx.UserService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.insertUser();
		applicationContext.close();
	}

}
