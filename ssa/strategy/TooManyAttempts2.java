package com.ssa.strategy;

public class TooManyAttempts2 extends TooManyAttempts {
	//show a msg of too many attempts of incorrect pin for account 2
	@Override
	public void tooManyAttemptsMsg() {
		System.out.println("Too Many Attempts for Account 2");
		
	}

}
