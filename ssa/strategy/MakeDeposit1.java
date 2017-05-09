package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class MakeDeposit1 extends MakeDeposit {

	//perform deposit operation for account 1
	@Override
	public void makeDeposit(DataStore d) {

		d.setBalance(d.getBalance1() + d.getTemp_d1());
	}

}
