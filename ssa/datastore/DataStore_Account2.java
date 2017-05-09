//*************************Data Store for Account 2 Start***************************
package com.ssa.datastore;

//DataStore for Account2, this will helps to store data for Account2
public class DataStore_Account2 extends DataStore {

	public static int temp_p;//pin temp
	public static int temp_y;//user id temp
	public static int temp_a;//balance temp
	public static int pin;//pin
	public static int uid;//user id
	public static int balance;//balance
	public static int temp_d;//deposit temp
	public static int temp_w;//withdraw amount temp
	public static int d;//deposit amount
	public static int w;//withdraw amount

	@Override
	public void setTemp_p(int p) {
		temp_p = p;
	}

	@Override
	public int getTemp_p2() {
		return temp_p;
	}

	@Override
	public void setTemp_y(int y) {
		temp_y = y;
	}

	@Override
	public int getTemp_y2() {
		return temp_y;
	}

	@Override
	public void setTemp_a(int y) {
		temp_a = y;
	}

	@Override
	public int getTemp_a2() {
		return temp_a;
	}

	@Override
	public void setPin(int temp_p) {
		pin = temp_p;
	}

	@Override
	public int getPin2() {
		return pin;
	}

	@Override
	public void setUid(int temp_y) {
		uid = temp_y;
	}

	@Override
	public int getUid2() {
		return uid;
	}

	@Override
	public void setBalance(int temp_a) {
		balance = temp_a;
	}

	@Override
	public int getBalance2() {
		return balance;
	}

	@Override
	public void setTemp_d(int d) {
		temp_d = d;
	}

	@Override
	public int getTemp_d2() {
		return temp_d;
	}

	@Override
	public void setTemp_w(int w) {
		temp_w = w;
	}

	@Override
	public int getTemp_w2() {
		return temp_w;
	}

	@Override
	public void setD(int temp_d) {
		d = temp_d;
	}

	@Override
	public int getD2() {
		return d;
	}

	@Override
	public void setW(int temp_w) {
		w = temp_w;
	}

	@Override
	public int getW2() {
		return w;
	}
}
//*************************Data Store for Account 2 End***************************

//********************************End of Data Store *************************
