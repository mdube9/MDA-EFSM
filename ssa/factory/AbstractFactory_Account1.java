//*************** Start of abstract Factory for Account 1 ************************
package com.ssa.factory;

import com.ssa.datastore.DataStore;
import com.ssa.datastore.DataStore_Account1;
import com.ssa.outputprocessor.OutputProcessor;
import com.ssa.strategy.DisplayBalance;
import com.ssa.strategy.DisplayBalance1;
import com.ssa.strategy.DisplayMenu;
import com.ssa.strategy.DisplayMenu1;
import com.ssa.strategy.IncorrectID;
import com.ssa.strategy.IncorrectID1;
import com.ssa.strategy.IncorrectPin;
import com.ssa.strategy.IncorrectPin1;
import com.ssa.strategy.MakeDeposit;
import com.ssa.strategy.MakeDeposit1;
import com.ssa.strategy.MakeWithdraw;
import com.ssa.strategy.MakeWithdraw1;
import com.ssa.strategy.NoFunds;
import com.ssa.strategy.Penalty;
import com.ssa.strategy.Penalty1;
import com.ssa.strategy.PromptForPin;
import com.ssa.strategy.PromptForPin1;
import com.ssa.strategy.StoreData;
import com.ssa.strategy.StoreData1;
import com.ssa.strategy.TooManyAttempts;
import com.ssa.strategy.TooManyAttempts1;
import com.ssa.strategy.WithdrawBelowMin;
import com.ssa.strategy.WithdrawBelowMin1;



//abstract factory for Account 1 used to get objects used by Account1
public class AbstractFactory_Account1 extends AbstractFactory {

	@Override
	public void initialize(AbstractFactory abstractFactory) {
		OutputProcessor outputProcessor = new OutputProcessor();
		outputProcessor.initialize(this);//initializing the output processor

	}

	@Override
	public StoreData getstoreData() {

		return new StoreData1();
	}

	@Override
	public IncorrectID getincorrectIDMsg() {

		return new IncorrectID1();
	}

	@Override
	public IncorrectPin getincorrectPinMsg() {

		return new IncorrectPin1();
	}

	@Override
	public TooManyAttempts gettooManyAttemptsMsg() {

		return new TooManyAttempts1();
	}

	@Override
	public DisplayMenu getdisplayMenu() {

		return new DisplayMenu1();
	}

	@Override
	public MakeDeposit getmakeDeposit() {

		return new MakeDeposit1();
	}

	@Override
	public DisplayBalance getdisplayBalance() {

		return new DisplayBalance1();
	}

	@Override
	public MakeWithdraw getmakeWithdraw() {

		return new MakeWithdraw1();
	}

	@Override
	public WithdrawBelowMin getwithdrawBelowMinMsg() {

		return new WithdrawBelowMin1();
	}

	@Override
	public NoFunds getdisplayNoFundsMsg() {

		return null;
	}

	@Override
	public PromptForPin getpromptForPin() {

		return new PromptForPin1();
	}

	@Override
	public Penalty getPenalty() {

		return new Penalty1();
	}

	@Override
	public DataStore getdatastore() {

		return new DataStore_Account1();
	}

}
//*************** End of abstract Factory for Account 1 ************************
