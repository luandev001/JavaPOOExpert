package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
		super(number, holder, balance);
		this.loanLimit = loadLimit;
	}

	public Double getLoadLimit() {
		return loanLimit;
	}

	public void setLoadLimit(Double loadLimit) {
		this.loanLimit = loadLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			//deposit(amount);
			balance += amount - 10.0;
		}
	}
}
