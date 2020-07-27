package com.core.IOC;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling by vodaphone sim");

	}

	@Override
	public void data() {

		System.out.println("browsing by vodaphone sim");
	}

}
