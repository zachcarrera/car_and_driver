package com.zachcarrera.caranddriver;

public class Driver extends Car {
	
	public Driver() {
		super();
	}
	
	public Driver drive() {
		this.gas -= 1;
		System.out.println("You drive the car.");
		this.status();
		return this;
	}
	public Driver useBoosters() {
		if (this.gas < 3) {
			System.out.println("Not enough gas to use boosters!");
			return this;
		}
		this.gas -= 3;
		System.out.println("You use boosters.");
		this.status();
		return this;
	}
	public Driver refuel() {
		if (this.gas > 8) {
			System.out.println("You cannot refuel at this time.");
			return this;
		}
		this.gas += 2;
		System.out.println("You refuel the car.");
		this.status();
		return this;
	}

}
