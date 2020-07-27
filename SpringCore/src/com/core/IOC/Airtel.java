package com.core.IOC;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("calling by Airtel sim");
	

	}

	@Override
	public void data() {
		System.out.println("browsing  by Airtel Sim");
	
	}

}
