package com.ssa.strategy;

import com.ssa.datastore.DataStore;

public class StoreData2 extends StoreData {
	//storing temp. data in data store for account 2
	@Override
	public void storeData(DataStore d) {
		d.setPin(d.getTemp_p2());
		d.setUid(d.getTemp_y2());
		d.setBalance(d.getTemp_a2());
	}

}
