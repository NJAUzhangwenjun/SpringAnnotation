package com.wjhub.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjhub.aop.MathCalculator;
import com.wjhub.bean.Boss;
import com.wjhub.bean.Car;
import com.wjhub.bean.Color;
import com.wjhub.bean.Red;
import com.wjhub.config.MainConfigOfAOP;
import com.wjhub.config.MainConifgOfAutowired;
import com.wjhub.dao.BookDao;
import com.wjhub.ext.ExtConfig;
import com.wjhub.service.BookService;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
		});
		
		applicationContext.close();
	}

}
