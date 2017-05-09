//************************************* Start of Input Processor Account 2****************
package com.ssa.inputprocessor;

import java.util.Scanner;

import com.ssa.datastore.DataStore;
import com.ssa.datastore.DataStore_Account2;
import com.ssa.factory.AbstractFactory;
import com.ssa.factory.AbstractFactory_Account2;
import com.ssa.mda.MDA;


public class Account2 {
	MDA mda;//pointer to mda
	DataStore dataStore;//pointer to data store
	int p, y, x, a, d, w;

	public void initialize(MDA mda) {
		AbstractFactory account2_Concrete = new AbstractFactory_Account2();//getting abstract factory for account 2
		account2_Concrete.initialize(account2_Concrete);
		this.mda = mda;
		dataStore = new DataStore_Account2();//initializing datastore
		menu();
	}

	public void print() {
		System.out.println("This is Account2");
	}
	//once started, user will given a list of options to choose from menu
	public void menu() {
		int choice;
		do {
			System.out.println("\n");
			System.out.println("Select the Operation you would like to perform in Account-1");
			//operations supported by Account 2
			System.out.println("1. OPEN (int p, int y, int a)");
			System.out.println("2. PIN (int x)");
			System.out.println("3. DEPOSIT (int d)");
			System.out.println("4. WITHDRAW (int w)");
			System.out.println("5. BALANCE ()");
			System.out.println("6. LOGIN(int y)");
			System.out.println("7. LOGOUT()");
			System.out.println("8. suspend()");
			System.out.println("9. activate()");
			System.out.println("10. close()");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();

			if (choice <= 10) {
				switch (choice) {
				case 1://open
					System.out.println("Enter the value of p");
					p = scanner.nextInt();
					System.out.println("Enter the value of y");
					y = scanner.nextInt();
					System.out.println("Enter the value of a");
					a = scanner.nextInt();
					open(p, y, a);
					break;
				case 2://pin
					System.out.println("Enter the value of x");
					x = scanner.nextInt();
					pin(x);
					break;
				case 3://deposit
					System.out.println("Enter the value of d");
					d = scanner.nextInt();
					deposit(d);
					break;
				case 4://withdraw
					System.out.println("Enter the value of w");
					w = scanner.nextInt();
					withdraw(w);
					break;
				case 5://show balance
					balance();
					break;
				case 6://login
					System.out.println("Enter the value of y");
					y = scanner.nextInt();
					login(y);
					break;
				case 7://logout
					logout();
					break;
				case 8://suspend 
					suspend();
					break;
				case 9://activate
					activate();
					break;
				case 10://close
					close();
					break;
				default:
					System.out.println("Operation not permitted in this state");
					break;
				}
			} else {
				System.out.println("Operation not permitted in this state");
				menu();
			}

		} while (choice <= 10);
	}

	//close the account system
	public void close() {
		mda.close();

	}

	//activate an account system from suspend state
	public void activate() {
		mda.activate();

	}

	//suspend an account system
	public void suspend() {
		mda.suspend();

	}

	//logout from account system
	public void logout() {
		mda.logout();

	}

	//login into account system
	public void login(int y) {
		if (y == dataStore.getUid2()) {//if user is matches
			mda.login();
		} else {
			mda.loginIncorrect();
		}
	}

	//show balance
	public void balance() {
		mda.balance();

	}

	//withdraw an amount
	public void withdraw(int w) {
		dataStore.setTemp_w(w);
		if ((dataStore.getBalance2()) > 0) {//if balance is above 0
			mda.withdraw();
			mda.withdrawAboveMin();
		} else {
			mda.withdrawBelowRequired();//if balance is below 0, No funds
		}
	}

	//deposit an amount into account
	public void deposit(int d) {
		dataStore.setTemp_d(d);
		mda.deposit();

	}

	//pin operation in account
	public void pin(int x) {
		if (x == dataStore.getPin2()) {//if pin matches
			mda.correctPinAboveMin();
		} else {
			mda.incorrectPin(2);
		}

	}

	//open operation on account 2
	public void open(int p, int y, int a) {
		dataStore.setTemp_p(p);
		dataStore.setTemp_y(y);
		dataStore.setTemp_a(a);
		mda.open();
	}

}
//************************************* End of Input Processor Account 2****************
