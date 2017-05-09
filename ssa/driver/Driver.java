//******************Driver Class for Account System Start****************************************
package com.ssa.driver;

import java.util.Scanner;

import com.ssa.inputprocessor.Account1;
import com.ssa.inputprocessor.Account2;
import com.ssa.mda.MDA;


//Driver Class for Account 1 and Account 2
public class Driver {
	public static void main(String args[]) {
		MDA mda = new MDA();//MDA which act as a controller for both account 1 and 2

		System.out.println("#######################################################################");
		System.out.println("CS:586 Software System Architecture ");
		System.out.println("Model Driven Architecture- Account System");
		System.out.println("By Vinit Bharat Shah - #A20350453");
		System.out.println("#######################################################################");
		char choice = 'z';
		while (choice != 'q') {
			//Asks for user's choice to choose between Account 1 and 2
			Scanner scanner = new Scanner(System.in);
			System.out.println("Select the Account of your choice");
			System.out.println("1. Account1");
			System.out.println("2. Account2");
			System.out.println("q. Exit");
			choice = scanner.next().charAt(0);
			switch (choice) {
			//Driving the Account system based on user's choice
			case '1':
				System.out.println("You Selected Account1");
				Account1 account1 = new Account1();
				account1.initialize(mda);//initializing Account1 
				break;
			case '2':
				System.out.println("You Selected Account2");
				Account2 account2 = new Account2();
				account2.initialize(mda);//initializing Account2
				break;
			default:
				System.out.println("Please select a valid Account");
				break;
			}

		}
		System.out.println("Thank you ! Good Byeee !!!");
	}

}
//******************Driver Class End****************************************
