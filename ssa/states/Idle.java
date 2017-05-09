package com.ssa.states;

import com.ssa.outputprocessor.OutputProcessor;
//idle state
public class Idle extends State {

	@Override
	public void open() {
		//DO Nothing

	}

	//does login into the system and asks for pin along with sets max attempts to 0
	@Override
	public void login() {
		OutputProcessor outputProcessor = createOutputProcessor();
		outputProcessor.promptForPin();
		create().setMax(0);

	}

	//if incorrect ID then calls an incorrectID action on output processor
	@Override
	public void loginIncorrect() {
		OutputProcessor outputProcessor = createOutputProcessor();
		outputProcessor.incorrectIDMsg();
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

	@Override
	public void unlockIncorrectPin() {
		//DO Nothing

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
		return 1;
	}

}
