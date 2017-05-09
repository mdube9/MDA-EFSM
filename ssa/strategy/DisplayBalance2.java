package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class DisplayBalance2 extends DisplayBalance {

	//showing balance for account 2
	@Override
	public void displayBalance(DataStore d) {
		System.out.println("Balance: $" + d.getBalance2());
	}

}
