package com.ssa.strategy;

public class WithdrawBelowMin1 extends WithdrawBelowMin {
//show the msg of balance is below the required minimum balance
	@Override
	public void withdrawBelowMinMsg() {
		System.out.println("Balance is below minimum required value.");
		
	}

}
//************************************** End of Strategy Pattern *************************