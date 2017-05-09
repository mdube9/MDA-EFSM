package com.ssa.strategy;

public class TooManyAttempts1 extends TooManyAttempts {
//show a msg of too many attempts of incorrect pin for account 1
	@Override
	public void tooManyAttemptsMsg() {
		System.out.println("Too Many Attempts for Account 1");
		
	}

}
