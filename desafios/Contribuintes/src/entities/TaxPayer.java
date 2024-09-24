package entities;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer() {
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending; 
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public Double salaryTax() {
		if(this.salaryIncome / 12 <= 3000) {
			double tax =0;
			return tax;
		}
		else if (this.salaryIncome / 12 <= 5000) {
			double tax = salaryIncome * 0.10;
			return tax;
		}

		else {
			double tax = salaryIncome * 0.20;
			return tax;
		}
		
		
	}
	
	public Double servicesTax() {
		double serviceTax = this.servicesIncome * 0.15;
		return serviceTax;  
	}
	
	public Double capitalTax() {
		double capitalTax = this.capitalIncome * 0.20;
		return capitalTax;
	}
	
	public Double grossTax() {
		double sum = salaryTax() + servicesTax() + capitalTax();
		return sum;
	}
	
	public Double taxRebate() {
		if ((this.healthSpending + this.educationSpending) > grossTax()) {
			double deductible = grossTax() * 0.30;
			return deductible;
		} else {
			double deductible = this.healthSpending + this.educationSpending;
			return deductible;
		}
	}
	
	public Double netTax() {
		double taxDue = grossTax() - taxRebate();
		return taxDue;
	}

}
