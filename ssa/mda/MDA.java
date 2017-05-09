//********************************* MDA Start Includes State pattern  ****************************
package com.ssa.mda;

import com.ssa.states.CheckPin;
import com.ssa.states.Idle;
import com.ssa.states.Locked;
import com.ssa.states.Overdrawn;
import com.ssa.states.Ready;
import com.ssa.states.S1;
import com.ssa.states.S2;
import com.ssa.states.S3;
import com.ssa.states.Start;
import com.ssa.states.State;
import com.ssa.states.Suspend;


public class MDA {
	public static int max = 0;// stores number of attempts of incorrect pin
	private final State stateList[] = { new Start(), new Idle(), new CheckPin(), new Ready(), new Overdrawn(),
			new Locked(), new Suspend(), new S1(), new S2(), new S3()};//state list for account system
	public State s = stateList[0];//maintains current state of account system

	//open operation on account
	public void open() {
		s.open();
		switch (s.getStateId()) {
		case 0:
			s = stateList[1];
			System.out.println("State changed to Idle. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;

		}
	}

	//login operation on account
	public void login() {
		s.login();
		switch (s.getStateId()) {
		case 1:
			s = stateList[2];
			System.out.println("State changed to CheckPin. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//if login in correct
	public void loginIncorrect() {
		s.loginIncorrect();
		switch (s.getStateId()) {
		case 1:
			s = stateList[1];
			System.out.println("State changed to Idle. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//if user enterns wrong pin
	public void incorrectPin(int max) {
		s.incorrectPin(max);
		switch (s.getStateId()) {
		case 2:
			if (MDA.max == max) {//if max attempts reached
				s = stateList[1];
				System.out.println("State changed to Idle. ");
			} else if (MDA.max < max) {
				s = stateList[2];
				System.out.println("State changed to CheckPin. ");
			}
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}

	}

	//if pin is correct and balance is above required value
	public void correctPinAboveMin() {
		s.correctPinAboveMin();
		switch (s.getStateId()) {
		case 2:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}
	//if pin is correct and balance is below required value
	public void correctPinBelowMin() {
		s.correctPinBelowMin();
		switch (s.getStateId()) {
		case 2:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//logout from account system
	public void logout() {
		s.logout();
		switch (s.getStateId()) {
		case 2:
			s = stateList[1];
			System.out.println("State changed to Idle. ");
			break;
		case 3:
			s = stateList[1];
			System.out.println("State changed to Idle. ");
			break;
		case 4:
			s = stateList[1];
			System.out.println("State changed to Idle. ");
			break;

		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//deposit an amount into account
	public void deposit() {
		s.deposit();
		switch (s.getStateId()) {
		case 3:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		case 4:
			s = stateList[7];
			System.out.println("State changed to S1 temporary state. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//deposit an amount and that brings account balance to above required value
	public void depositAboveMin() {
		s.depositAboveMin();
		switch (s.getStateId()) {
		case 3:
			s = stateList[3];
			break;
		case 7:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		default:
			System.out.println("Operation not permitted in this state.");
			break;

		}
	}
	//deposit an amount and that brings account balance to below required value
	public void depositBelowMin() {
		s.depositBelowMin();
		switch (s.getStateId()) {
		case 7:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;

		}
	}

	//show balance
	public void balance() {
		s.balance();
		switch (s.getStateId()) {
		case 3:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		case 4:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		case 6:
			s = stateList[6];
			System.out.println("State changed to Suspend. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//withdraw an amount from account
	public void withdraw() {
		s.withdraw();
		switch (s.getStateId()) {
		case 3:
			s = stateList[8];
			System.out.println("State changed to S2. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//withdraw an amount from account and balance is above required value
	public void withdrawAboveMin() {
		s.withdrawAboveMin();
		switch (s.getStateId()) {
		case 8:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}
	//withdraw an amount from account and balance is below required value
	public void withdrawBelowMin() {
		s.withdrawBelowMin();
		switch (s.getStateId()) {
		case 8:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	////withdraw an amount from account and balance is below required value
	public void withdrawBelowRequired() {
		s.withdrawBelowRequired();
		switch (s.getStateId()) {
		case 3:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		case 4:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//lock an account
	public void lock() {
		s.lock();
		switch (s.getStateId()) {
		case 3:
			s = stateList[5];
			System.out.println("State changed to Locked. ");
			break;
		case 4:
			s = stateList[5];
			System.out.println("State changed to Locked. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//if incorrect pin is entered
	public void lockIncorrectPin() {
		s.lockIncorrectPin();
		switch (s.getStateId()) {
		case 3:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		case 4:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//incorrect pin entered while unlocking
	public void unlockIncorrectPin() {
		s.unlockIncorrectPin();
		switch (s.getStateId()) {
		case 5:
			s = stateList[5];
			System.out.println("State changed to Locked. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}

	}

	//unlock an account
	public void unlock() {
		s.unlock();
		switch (s.getStateId()) {
		case 5:
			s = stateList[9];
			System.out.println("State changed to S3. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}

	}

	//unlock an account and balance is above required value
	public void unlockAboveMin() {
		s.unlockAboveMin();
		switch (s.getStateId()) {
		case 9:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//unlock an account and balance is below required value
	public void unlockBelowMin() {
		s.unlockBelowMin();
		switch (s.getStateId()) {
		case 9:
			s = stateList[4];
			System.out.println("State changed to Overdrawn. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//suspend an account
	public void suspend() {
		s.suspend();
		switch (s.getStateId()) {
		case 3:
			s = stateList[6];
			System.out.println("State changed to Suspend. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//activate a suspend account
	public void activate() {
		s.activate();
		switch (s.getStateId()) {
		case 6:
			s = stateList[3];
			System.out.println("State changed to Ready. ");
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}
	}

	//close an account system
	public void close() {
		s.close();
		switch (s.getStateId()) {
		case 6:
			System.out.println("Account System is Closed, Now you can't perform any action. Thank you");
			System.exit(0);
			break;
		default:
			System.out.println("Operation not permitted in this state");
			break;
		}

	}

	//returns number of incorrect attempts while entering pin
	public static int getMax() {
		return max;
	}

	//set number of incorrect attempts while entering pin
	public static void setMax(int max) {
		MDA.max = max;
	}

}
//********************************* MDA End ****************************
