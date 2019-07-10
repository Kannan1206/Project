package org.cts;

public class IndianBank implements ICICIBank {

	@Override
	public void saving() {
		System.out.println("5%");
		
	}

	@Override
	public void deposit() {
		System.out.println("6%");
		
	}

	@Override
	public void fixed() {
		System.out.println("7%");
		
	}
public static void main(String[] args) {
	IndianBank Bank = new IndianBank();
	Bank.deposit();
	Bank.saving();
	Bank.fixed();
	}
}
