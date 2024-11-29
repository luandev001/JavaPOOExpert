package model.services;

public class BrazilTaxService implements TaxService {

	public double tax(Double amount) { //double está declarado como primitivo pois sempre receberá um valor em amount
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

	@Override
	public double tax(double amount) {
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

	
}
