package model;

public abstract class Account 
{
	protected int currentBalance=0;
	private int charges;
	private Customer accountHolder;
	
	Account(Customer accountHolder)
	{
		this.accountHolder = accountHolder;
	}

	protected int getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	int getCharges() {
		return charges;
	}

	void setCharges(int charges) {
		this.charges = charges;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		accountHolder = accountHolder;
	}
	
}
