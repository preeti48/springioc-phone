package com.preethi.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("Using Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel data");
		
	}
	

}
