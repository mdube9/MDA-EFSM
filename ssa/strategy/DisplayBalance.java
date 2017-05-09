//************************************** Start of Strategy Pattern *************************
package com.ssa.strategy;
//abstract class for display balance
import com.ssa.datastore.DataStore;

public abstract class DisplayBalance {
	public abstract void displayBalance(DataStore d);
}
