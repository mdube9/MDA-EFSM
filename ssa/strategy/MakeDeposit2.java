package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class MakeDeposit2 extends MakeDeposit {
	//perform deposit operation for account 2
	@Override
	public void makeDeposit(DataStore d) {
		d.setBalance(d.getBalance2() + d.getTemp_d2());
		
	}

	

}
