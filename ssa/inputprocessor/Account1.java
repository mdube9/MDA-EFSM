//************************************* Start of Input Processor Account 1****************
package com.ssa.inputprocessor;

import java.util.Scanner;

import com.ssa.datastore.DataStore;
import com.ssa.datastore.DataStore_Account1;
import com.ssa.factory.AbstractFactory;
import com.ssa.factory.AbstractFactory_Account1;
import com.ssa.mda.MDA;



public class Account1 {

	MDA mda;//mda object pointer
	DataStore dataStore; //data store pointer
	String p, y, x;
	float a, d, w;

	public void initialize(MDA mda) {
		AbstractFactory account1_Concrete = new AbstractFactory_Account1();//getting an abstract factory for account1
		account1_Concrete.initialize(account1_Concrete);
		this.mda = mda;
		dataStore = new DataStore_Account1();//initialization of datastore for Account 1
		menu();
	}

	public void print() {
		System.out.println("This is Account1");
	}

	//once started, user will given a list of options to choose from menu
	public void menu() {
		int choice;
		do {
			System.out.println("\n");
			System.out.println("Select the Operation you would like to perform in Account-1");
			//operations supported by Account 1
			System.out.println("1. open (string p, string y, float a)");
			System.out.println("2. pin (string x)");
			System.out.println("3. deposit (float d)");
			System.out.println("4. withdraw (float w)");
			System.out.println("5. balance ()");
			System.out.println("6. login(string y)");
			System.out.println("7. logout()");
			System.out.println("8. lock(string x)	");
			System.out.println("9. unlock(string x)");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			if (choice <= 9) {
				Scanner scanner2 = new Scanner(System.in);
				switch (choice) {
				case 1://open
					System.out.println("Enter the value of p");
					p = scanner2.nextLine();
					System.out.println("Enter the value of y");
					y = scanner2.nextLine();
					System.out.println("Enter the value of a");
					a = scanner2.nextFloat();
					open(p, y, a);
					break;
				case 2://pin
					System.out.println("Enter the value of x");
					x = scanner2.nextLine();
					pin(x);
					break;
				case 3://Deposit
					System.out.println("Enter the value of d");
					d = scanner2.nextFloat();
					deposit(d);
					break;
				case 4://Withdraw
					System.out.println("Enter the value of w");
					w = scanner2.nextFloat();
					withdraw(w);
					break;
				case 5://view balance
					balance();
					break;
				case 6://login
					System.out.println("Enter the value of y");
					y = scanner2.nextLine();
					login(y);
					break;
				case 7://logout
					logout();
					break;
				case 8://Lock Account
					System.out.println("Enter the value of x");
					x = scanner2.nextLine();
					lock(x);
					break;
				case 9://Unlock Account
					System.out.println("Enter the value of x");
					x = scanner2.nextLine();
					unlock(x);
					break;
				default:
					System.out.println("Operation not permitted in this state");
					break;
				}
			} else {
				System.out.println("\nOperation not permitted in this state");
				menu();
			}
		} while (choice <= 9);

	}

	public void unlock(String x) {
		//if pin matches then unlocked otherwise stay in same state
		if (x.equals(dataStore.getPin1())) {
			mda.unlock();
			if (dataStore.getBalance1() > 500) {
				mda.unlockAboveMin();//to ready state
			} else {
				mda.unlockBelowMin();//to overdrawn state
			}
		} else {
			mda.unlockIncorrectPin();//to Locked state
		}

	}

	public void lock(String x) {
		//lock an account if Pin matches else stay in same state
		if (x.equals(dataStore.getPin1())) {
			mda.lock();
		} else {
			mda.lockIncorrectPin();
		}
	}

	//logout from account
	public void logout() {
		mda.logout();

	}

	//login to Account to perform required action
	public void login(String y) {
		//if user id matches then login to system
		if (y.equals(dataStore.getUid1())) {
			mda.login();
		} else {
			mda.loginIncorrect();//incorrect login
		}
	}
	//show balance of account
	public void balance() {
		mda.balance();
	}

	//withdraw an amount from account
	public void withdraw(float w) {
		dataStore.setTemp_w(w);
		if (dataStore.getBalance1() > 500) {//if in ready state
			mda.withdraw();
			if (dataStore.getBalance1() > (dataStore.getTemp_w1() + 500)) {//after withdraw balance is above 500
				mda.withdrawAboveMin();
			} else if ((dataStore.getBalance1() - dataStore.getTemp_w1()) <= 500) {//after withdraw balance is below 500
				mda.withdrawBelowMin();
			}
		}
		else if (dataStore.getBalance1() <= 500) {//if balance is below 500 in overdrawn state
			mda.withdrawBelowRequired();
		}

	}

	//deposit an amount in account
	public void deposit(float d) {
		dataStore.setTemp_d(d);
		mda.deposit();
		if (dataStore.getBalance1() > 500) {//deposit makes balance above 500, go to ready state
			mda.depositAboveMin();
		} else {
			mda.depositBelowMin();//deposit makes balance below 500, go to Overdrawn
		}

	}

	//pin operation on account
	public void pin(String x) {
		if (x.equals(dataStore.getPin1())) {//if pin matches
			if (dataStore.getBalance1() > 500) {
				mda.correctPinAboveMin();//ready
			} else {
				mda.correctPinBelowMin();//over drawn
			}
		} else {
			mda.incorrectPin(3);//if in correct pin, set the max number o attempts
		}

	}

	//open operation on account
	public void open(String p, String y, float a) {
		dataStore.setTemp_p(p);// storing data in temp. variables
		dataStore.setTemp_y(y);
		dataStore.setTemp_a(a);
		mda.open();// calling function on mda
	}

}

//************************************* End of Input Processor Account 1****************
