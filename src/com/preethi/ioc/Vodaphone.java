package com.preethi.ioc;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("Using Vodaphone");
		
	}

	@Override
	public void data() {
		System.out.println("Vodaphone data");
		
	}
	

}
