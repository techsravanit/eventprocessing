package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.EditCityHandler;

public class EPTest {

	public static void main(String[] args) {
		//BeanFactory will not support EventProcessing.
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ep/common/application-context.xml");
		EditCityHandler ech=context.getBean("editCityHandler", EditCityHandler.class);
		ech.updateCity(1,"chennai");
	}

}
