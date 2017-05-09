//*************** Start of abstract Factory for Account 2 ************************
package com.ssa.factory;

import com.ssa.datastore.DataStore;
import com.ssa.datastore.DataStore_Account2;
import com.ssa.outputprocessor.OutputProcessor;
import com.ssa.strategy.DisplayBalance;
import com.ssa.strategy.DisplayBalance2;
import com.ssa.strategy.DisplayMenu;
import com.ssa.strategy.DisplayMenu2;
import com.ssa.strategy.IncorrectID;
import com.ssa.strategy.IncorrectID2;
import com.ssa.strategy.IncorrectPin;
import com.ssa.strategy.IncorrectPin2;
import com.ssa.strategy.MakeDeposit;
import com.ssa.strategy.MakeDeposit2;
import com.ssa.strategy.MakeWithdraw;
import com.ssa.strategy.MakeWithdraw2;
import com.ssa.strategy.NoFunds;
import com.ssa.strategy.NoFunds2;
import com.ssa.strategy.Penalty;
import com.ssa.strategy.PromptForPin;
import com.ssa.strategy.PromptForPin2;
import com.ssa.strategy.StoreData;
import com.ssa.strategy.StoreData2;
import com.ssa.strategy.TooManyAttempts;
import com.ssa.strategy.TooManyAttempts2;
import com.ssa.strategy.WithdrawBelowMin;


//abstract factory for Account 2 used to get objects used by Account2
public class AbstractFactory_Account2 extends AbstractFactory {

	@Override
	public DataStore getdatastore() {
		// TODO Auto-generated method stub
		return new DataStore_Account2();
	}

	@Override
	public void initialize(AbstractFactory abstractFactory) {
		OutputProcessor outputProcessor = new OutputProcessor();
		outputProcessor.initialize(this);
	}

	@Override
	public StoreData getstoreData() {
		// TODO Auto-generated method stub
		return new StoreData2();
	}

	@Override
	public IncorrectID getincorrectIDMsg() {
		// TODO Auto-generated method stub
		return new IncorrectID2();
	}

	@Override
	public IncorrectPin getincorrectPinMsg() {
		// TODO Auto-generated method stub
		return new IncorrectPin2();
	}

	@Override
	public TooManyAttempts gettooManyAttemptsMsg() {
		// TODO Auto-generated method stub
		return new TooManyAttempts2();
	}

	@Override
	public DisplayMenu getdisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	@Override
	public MakeDeposit getmakeDeposit() {
		// TODO Auto-generated method stub
		return new MakeDeposit2();
	}

	@Override
	public DisplayBalance getdisplayBalance() {
		// TODO Auto-generated method stub
		return new DisplayBalance2();
	}

	@Override
	public MakeWithdraw getmakeWithdraw() {
		// TODO Auto-generated method stub
		return new MakeWithdraw2();
	}

	@Override
	public WithdrawBelowMin getwithdrawBelowMinMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoFunds getdisplayNoFundsMsg() {
		// TODO Auto-generated method stub
		return new NoFunds2();
	}

	@Override
	public PromptForPin getpromptForPin() {
		// TODO Auto-generated method stub
		return new PromptForPin2();
	}

	@Override
	public Penalty getPenalty() {
		// TODO Auto-generated method stub
		return null;
	}

}
//*************** End of abstract Factory for Account 2 ************************


//****************************************** End of Abstract Factory Pattern*****************
