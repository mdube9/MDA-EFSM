package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class MakeWithdraw1 extends MakeWithdraw {

	//withdraw action for account 1
	@Override
	public void makeWithdraw(DataStore d) {
		d.setBalance(d.getBalance1()-d.getTemp_w1());
		
	}

}
