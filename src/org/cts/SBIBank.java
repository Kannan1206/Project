package org.cts;

public class SBIBank extends RBIBank {

	@Override
	public void saving() {
		System.out.println("6%");
		
	}

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}
public static void main(String[] args) {
	SBIBank Bank = new SBIBank();
	Bank.saving();
	Bank.deposit();
	Bank.fixed();
}
}
