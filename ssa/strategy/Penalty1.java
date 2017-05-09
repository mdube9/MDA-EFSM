package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class Penalty1 extends Penalty {
//apply penalty for account 1
	@Override
	public void penalty(DataStore d) {
		System.out.println("Penalty Applied of $20");
		d.setBalance(d.getBalance1() - 20);

	}

}
