package com.ssa.states;
//ready state
public class Ready extends State {

	@Override
	public void open() {
		//Do Nothing
		
	}

	@Override
	public void login() {
		//Do Nothing
		
	}

	@Override
	public void loginIncorrect() {
		//Do Nothing
		
	}

	@Override
	public void incorrectPin(int max) {
		//Do Nothing
		
	}

	@Override
	public void correctPinAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void correctPinBelowMin() {
		//Do Nothing
		
	}

	@Override
	public void logout() {
		//Do Nothing
		
	}

	//calls an action on output processor to deposit an amount
	@Override
	public void deposit() {
		
		createOutputProcessor().makeDeposit();
		
	}

	@Override
	public void depositAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void depositBelowMin() {
		//Do Nothing
		
	}

	//calls an action on output processor to show balance
	@Override
	public void balance() {
		createOutputProcessor().displayBalance();
		
	}

	//calls an action on output processor to withdraw from account
	@Override
	public void withdraw() {
		createOutputProcessor().makeWithdraw();
	}

	@Override
	public void withdrawAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void withdrawBelowMin() {
		//Do Nothing
		
	}

	//calls an action on output processor when balance is below the required min. value
	@Override
	public void withdrawBelowRequired() {
		createOutputProcessor().displayNoFundsMsg();
		
	}

	@Override
	public void lock() {
		//Do Nothing
		
	}

	//calls an action on output processor when user enters incorrect pin while lock operation
	@Override
	public void lockIncorrectPin() {
		createOutputProcessor().incorrectPinMsg();
		
	}

	@Override
	public void unlockIncorrectPin() {
		//Do Nothing
		
	}

	@Override
	public void unlock() {
		//Do Nothing
		
	}

	@Override
	public void unlockAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void unlockBelowMin() {
		//Do Nothing
		
	}

	@Override
	public void suspend() {
		//Do Nothing
		
	}

	@Override
	public void activate() {
		//Do Nothing
		
	}

	@Override
	public void close() {
		//Do Nothing
		
	}

	@Override
	public int getStateId() {
		//Do Nothing
		return 3;
	}

	
}
