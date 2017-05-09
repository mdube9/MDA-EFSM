package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class StoreData1 extends StoreData {

	//storing temp. data in data store for account 1
	@Override
	public void storeData(DataStore d) {
		d.setPin(d.getTemp_p1());
		d.setUid(d.getTemp_y1());
		d.setBalance(d.getTemp_a1());
	}
}
