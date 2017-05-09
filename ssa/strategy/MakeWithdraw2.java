package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class MakeWithdraw2 extends MakeWithdraw {
	//withdraw action for account 2
	@Override
	public void makeWithdraw(DataStore d) {
		d.setBalance(d.getBalance2() - d.getTemp_w2());

	}

}
