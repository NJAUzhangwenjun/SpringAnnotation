package com.wjhub.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjhub.bean.Boss;
import com.wjhub.bean.Car;
import com.wjhub.bean.Color;
import com.wjhub.bean.Red;
import com.wjhub.bean.Yellow;
import com.wjhub.config.MainConfigOfProfile;
import com.wjhub.config.MainConifgOfAutowired;
import com.wjhub.dao.BookDao;
import com.wjhub.service.BookService;

public class IOCTest_Profile {
	
	//1��ʹ�������ж�̬����: �����������λ�ü��� -Dspring.profiles.active=test
	//2������ķ�ʽ����ĳ�ֻ�����
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext();
		//1������һ��applicationContext
		//2��������Ҫ����Ļ���
		applicationContext.getEnvironment().setActiveProfiles("dev");
		//3��ע����������
		applicationContext.register(MainConfigOfProfile.class);
		//4������ˢ������
		applicationContext.refresh();
		
		
		String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
		for (String string : namesForType) {
			System.out.println(string);
		}
		
		Yellow bean = applicationContext.getBean(Yellow.class);
		System.out.println(bean);
		applicationContext.close();
	}

}