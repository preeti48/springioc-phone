package com.preethi.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		// with using spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//System.out.println("config loaded");
				
		Airtel air = (Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		
		Vodaphone vod = context.getBean("voda", Vodaphone.class);
		vod.calling();
		vod.data();
		
		Sim s =  context.getBean("sim", Sim.class);
		s.calling();
		s.data();
		
		
		
		
		
		
		// without using spring
		/* 
		Airtel air= new Airtel();
		air.calling();
		air.calling();
		Vodaphone voda = new Vodaphone();
		voda.calling();
		voda.data();
		System.out.println("=================");
		
		Sim sima = new Airtel();
		Sim	simv = new Vodaphone();
		sima.calling();
		sima.data();
		simv.calling();
		simv.data();
		*/
		
		
		

		
	}

}
