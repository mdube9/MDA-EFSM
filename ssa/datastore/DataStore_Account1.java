//*************************Data Store for Account 1 Start***************************
package com.ssa.datastore;


//DataStore for Account1, this will helps to store data for Account1
public class DataStore_Account1 extends DataStore {
	public static String temp_p;//pin temp.
	public static String temp_y;//user id temp
	public static float temp_a;//account balance temp
	public static String temp_x;//pin temp
	public static String pin;//pin
	public static String uid;//userid
	public static float balance;//balance
	public static float temp_d;//depeosit amount temp
	public static float temp_w;//withdraw amount temp
	public static float d;//deposit amount
	public static float w;//withdraw amount


	@Override
	public void setTemp_p(String p) {
		temp_p = p;
	}

	@Override
	public String getTemp_p1() {
		return temp_p;
	}

	@Override
	public void setTemp_y(String y) {
		temp_y=y;
	}

	@Override
	public String getTemp_y1() {
		return temp_y;
	}

	@Override
	public void setTemp_a(float a) {
		temp_a=a;
	}

	@Override
	public float getTemp_a1() {
		return temp_a;
	}

	@Override
	public void setPin(String temp_p) {
		pin=temp_p;
	}

	@Override
	public String getPin1() {
		return pin;
	}

	@Override
	public void setUid(String temp_y) {
		uid=temp_y;
	}

	@Override
	public String getUid1() {
		return uid;
	}

	@Override
	public void setBalance(float temp_a) {
		balance=temp_a;
	}

	@Override
	public float getBalance1() {
		return balance;
	}

	@Override
	public void setTemp_d(float d) {
		temp_d=d;
	}

	@Override
	public float getTemp_d1() {
		return temp_d;
	}

	@Override
	public void setTemp_w(float w) {
		temp_w=w;
	}

	@Override
	public float getTemp_w1() {
		return temp_w;
	}

	@Override
	public void setD(float temp_d) {
		d=temp_d;
	}

	@Override
	public float getD1() {
		return d;
	}

	@Override
	public void setW(float temp_w) {
		w=temp_w;
	}

	@Override
	public float getW1() {
		return w;
	}
}

//*************************Data Store for Account 1 End ***************************
