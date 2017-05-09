package com.ssa.states;

import com.ssa.outputprocessor.OutputProcessor;
//check pin state
public class CheckPin extends State {

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

	//calls an action on output processor when user enters incorrect pin also increments number of attempts in MDA.
	@Override
	public void incorrectPin(int max) {
		OutputProcessor outputProcessor = createOutputProcessor();
		outputProcessor.incorrectPinMsg();
		if (max == create().getMax()) {
			outputProcessor.tooManyAttemptsMsg();
			create().setMax(create().getMax() + 1);
		} else {
			create().setMax(create().getMax() + 1);
		}

	}

	//when pin is correct and balance is above required value then calls an action on output processor
	@Override
	public void correctPinAboveMin() {
		createOutputProcessor().displayMenu();

	}

	//when pin is correct and balance is below required value then calls an action on output processor
	@Override
	public void correctPinBelowMin() {
		createOutputProcessor().displayMenu();

	}

	@Override
	public void logout() {

	}

	@Override
	public void deposit() {
		//Do Nothing

	}

	@Override
	public void depositAboveMin() {
		//Do Nothing

	}

	@Override
	public void depositBelowMin() {
		//Do Nothing

	}

	@Override
	public void balance() {
		//Do Nothing

	}

	@Override
	public void withdraw() {
		//Do Nothing

	}

	@Override
	public void withdrawAboveMin() {
		//Do Nothing

	}

	@Override
	public void withdrawBelowMin() {
		//Do Nothing

	}

	@Override
	public void withdrawBelowRequired() {
		//Do Nothing

	}

	@Override
	public void lock() {
		//Do Nothing

	}

	@Override
	public void lockIncorrectPin() {

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
		return 2;
	}

}
