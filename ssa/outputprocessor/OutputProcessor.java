//**************************** Start Output Processor, participates in Strategy Pattern ***********************
package com.ssa.outputprocessor;

import com.ssa.datastore.DataStore;
import com.ssa.factory.AbstractFactory;
import com.ssa.strategy.DisplayBalance;
import com.ssa.strategy.DisplayMenu;
import com.ssa.strategy.IncorrectID;
import com.ssa.strategy.IncorrectPin;
import com.ssa.strategy.MakeDeposit;
import com.ssa.strategy.MakeWithdraw;
import com.ssa.strategy.NoFunds;
import com.ssa.strategy.Penalty;
import com.ssa.strategy.PromptForPin;
import com.ssa.strategy.StoreData;
import com.ssa.strategy.TooManyAttempts;
import com.ssa.strategy.WithdrawBelowMin;
//responsible to call an action being invoked by MDA
public class OutputProcessor {

	//maintains pointers to all output strategies
	public static DataStore d;//pointer to data store
	public static StoreData sd;//pointer to store data strategy action
	public static IncorrectID inId;//pointer to Incorrect ID strategy action

	public static IncorrectPin inPin;//pointer to IncorrectPin strategy action
	public static TooManyAttempts manyAttempts;//pointer to TooManyAttempts strategy action
	public static DisplayMenu menu;//pointer to DisplayMenu strategy action

	public static MakeDeposit deposit;//pointer to MakeDeposit strategy action
	public static DisplayBalance balance;//pointer to DisplayBalance strategy action
	public static MakeWithdraw withdraw;//pointer to MakeWithdraw strategy action

	public static WithdrawBelowMin withdrawBelow;//pointer to WithdrawBelowMin strategy action
	public static NoFunds noFunds;//pointer to NoFunds strategy action
	public static PromptForPin promptPin;//Pointer to PromptForPin strategy action

	public static Penalty penalty;//Pointer to Penalty strategy action

	public void initialize(AbstractFactory abstractFactory) {
		d = abstractFactory.getdatastore();
		sd = abstractFactory.getstoreData();
		inId = abstractFactory.getincorrectIDMsg();
		inPin = abstractFactory.getincorrectPinMsg();
		manyAttempts = abstractFactory.gettooManyAttemptsMsg();
		menu = abstractFactory.getdisplayMenu();
		deposit = abstractFactory.getmakeDeposit();
		balance = abstractFactory.getdisplayBalance();
		withdraw = abstractFactory.getmakeWithdraw();
		withdrawBelow = abstractFactory.getwithdrawBelowMinMsg();
		noFunds = abstractFactory.getdisplayNoFundsMsg();
		promptPin = abstractFactory.getpromptForPin();
		penalty = abstractFactory.getPenalty();
	}
	
	public DataStore getDataStore(){//returns DataStore pointer
		return d;
	}
	
	public void storeData(){//calls action on storedata to store temp values
		sd.storeData(d);
	}
	
	public void incorrectIDMsg(){//calls an action to print incorrect ID msg
		inId.incorrectIDMsg();
	}
	public void incorrectPinMsg(){//calls an action to print incorrect pin msg
		inPin.incorrectPinMsg();
	}
	
	public void tooManyAttemptsMsg(){////calls an action to print too ManyAttempts  msg
		manyAttempts.tooManyAttemptsMsg();
	}
	
	public void displayMenu(){//calls an action to display menu for respective account
		menu.displayMenu();
	}
	
	public void makeDeposit(){//calls an action to deposit in account
		deposit.makeDeposit(d);
	}
	public void displayBalance(){//calls an action to show balance for an account
		balance.displayBalance(d);
	}
	public void makeWithdraw(){//calls an action to make withdraw from account
		withdraw.makeWithdraw(d);
	}
	public void withdrawBelowMinMsg(){//calls a action to display a msg saying balance is below required value
		withdrawBelow.withdrawBelowMinMsg();
	}
	public void displayNoFundsMsg(){//calls an action to display no funds msg
		noFunds.displayNoFundsMsg();
	}
	public void promptForPin(){//calls an action to ask for pin for account
		promptPin.promptForPin();
	}
	public void penalty(){//calls an action to apply penalty when user tries to withdraw and balance goes below minimum balance
		penalty.penalty(d);
	}
	
	
	

}
//**************************** End Output Processor ***********************
