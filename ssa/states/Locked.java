package com.ssa.states;

//Locked state
public class Locked extends State {

	@Override
	public void open() {
		//DO Nothing
		
	}

	@Override
	public void login() {
		//DO Nothing
		
	}

	@Override
	public void loginIncorrect() {
		//DO Nothing
		
	}

	@Override
	public void incorrectPin(int max) {
		//DO Nothing
		
	}

	@Override
	public void correctPinAboveMin() {
		//DO Nothing
		
	}

	@Override
	public void correctPinBelowMin() {
		//DO Nothing
		
	}

	@Override
	public void logout() {
		//DO Nothing
		
	}

	@Override
	public void deposit() {
		//DO Nothing
		
	}

	@Override
	public void depositAboveMin() {
		//DO Nothing
		
	}

	@Override
	public void depositBelowMin() {
		//DO Nothing
		
	}

	@Override
	public void balance() {
		//DO Nothing
		
	}

	@Override
	public void withdraw() {
		//DO Nothing
		
	}

	@Override
	public void withdrawAboveMin() {
		//DO Nothing
		
	}

	@Override
	public void withdrawBelowMin() {
		//DO Nothing
		
	}

	@Override
	public void withdrawBelowRequired() {
		//DO Nothing
		
	}

	@Override
	public void lock() {
		//DO Nothing
		
	}

	@Override
	public void lockIncorrectPin() {
		//DO Nothing
		
	}

	//calls an operation on output processor when user enters incorrect pin while unlocking
	@Override
	public void unlockIncorrectPin() {
		createOutputProcessor().incorrectPinMsg();
	}

	@Override
	public void unlock() {
		//DO Nothing
		
	}

	@Override
	public void unlockAboveMin() {
		//DO Nothing
		
	}

	@Override
	public void unlockBelowMin() {
		//DO Nothing
		
	}

	@Override
	public void suspend() {
		//DO Nothing
		
	}

	@Override
	public void activate() {
		//DO Nothing
		
	}

	@Override
	public void close() {
		//DO Nothing
		
	}

	@Override
	public int getStateId() {
		//DO Nothing
		return 5;
	}

}
