package com.autoanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig2.xml");
		Employe restruntobj= (Employe)context.getBean("employe");
		System.out.print(restruntobj.address.city);
	}

}
