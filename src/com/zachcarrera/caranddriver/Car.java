package com.zachcarrera.caranddriver;

public class Car {
	protected int gas;
	
	public Car() {
		this.gas = 10;
		
	}
	
	public void status() {
		System.out.printf("Gas remaining: %d/10\n", this.gas);
	}

	// getters and setters
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
}
