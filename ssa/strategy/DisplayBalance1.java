package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class DisplayBalance1 extends DisplayBalance {
//showing balance for account 1
	@Override
	public void displayBalance(DataStore d) {
		System.out.println("Balance: $" + d.getBalance1());

	}

}
