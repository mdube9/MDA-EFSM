//****************************************** Start of Abstract Factory Pattern*****************
package com.ssa.factory;

import com.ssa.datastore.DataStore;
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


//abstract class defined for an abstract factory implementation which will help to invoke an object to class
public abstract class AbstractFactory {

	public abstract DataStore getdatastore();

	public abstract void initialize(AbstractFactory abstractFactory);

	public abstract StoreData getstoreData();

	public abstract IncorrectID getincorrectIDMsg();

	public abstract IncorrectPin getincorrectPinMsg();

	public abstract TooManyAttempts gettooManyAttemptsMsg();

	public abstract DisplayMenu getdisplayMenu();

	public abstract MakeDeposit getmakeDeposit();

	public abstract DisplayBalance getdisplayBalance();

	public abstract MakeWithdraw getmakeWithdraw();

	public abstract WithdrawBelowMin getwithdrawBelowMinMsg();

	public abstract NoFunds getdisplayNoFundsMsg();

	public abstract PromptForPin getpromptForPin();

	public abstract Penalty getPenalty();

}
