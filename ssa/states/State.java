//*********************************** Start of State Pattern *********************************
package com.ssa.states;

import com.ssa.mda.MDA;
import com.ssa.outputprocessor.OutputProcessor;
//an abstract class defined for all the states of account system
public abstract class State {
	//MDA
	public MDA create(){
		return new MDA();
	}
	
	public OutputProcessor outputProcessor;
	//output processor
	public OutputProcessor createOutputProcessor(){
		return new OutputProcessor();
	}

	public abstract void open();

	public abstract void login();

	public abstract void loginIncorrect();

	public abstract void incorrectPin(int max);

	public abstract void correctPinAboveMin();

	public abstract void correctPinBelowMin();

	public abstract void logout();

	public abstract void deposit();

	public abstract void depositAboveMin();

	public abstract void depositBelowMin();

	public abstract void balance();

	public abstract void withdraw();

	public abstract void withdrawAboveMin();

	public abstract void withdrawBelowMin();

	public abstract void withdrawBelowRequired();

	public abstract void lock();

	public abstract void lockIncorrectPin();

	public abstract void unlockIncorrectPin();

	public abstract void unlock();

	public abstract void unlockAboveMin();

	public abstract void unlockBelowMin();

	public abstract void suspend();

	public abstract void activate();

	public abstract void close();

	public abstract int getStateId();
	

}
