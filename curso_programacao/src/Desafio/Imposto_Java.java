package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_Java {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Renda anual com salário: ");
		double incomeAnnual = sc.nextDouble(); // Renda anual

		System.out.println("Renda anual com prestação de serviço: ");
		double serviceProvision = sc.nextDouble();// pretação de serviço

		System.out.println("Renda anual com ganho de capital: ");
		double capitalGain = sc.nextDouble(); // Ganho de capital

		System.out.println("Gastos médicos: ");
		double medicalExpenses = sc.nextDouble(); // Gastos médico

		System.out.println("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble(); // Gastos educacionais

		double tax = 0;

		if (incomeAnnual / 12 <= 3000) {
			tax = 0;
		}

		else if (incomeAnnual / 12 <= 5000) {
			tax = incomeAnnual * 0.10;
		}

		else {
			tax = incomeAnnual * 0.20;
		}
		
		double taxServiceProvision = 0; // Taxa de prestação de Serviço --> 15%
		if (serviceProvision > 0) {
			taxServiceProvision = serviceProvision * 0.15;
		}
		
		System.out.println("Ganho de capital R$ " + capitalGain);
		double taxCapitalGain = 0; // imposto Ganho de capital
		if (capitalGain > 0) {
			taxCapitalGain = capitalGain * 0.20;
		}
		
		double totalGrossTax = tax + taxServiceProvision + taxCapitalGain; // imposto bruto total.
		double deductibleExpenses = 0; // Gastos dedutíveis
		double maxDeductible = 0; // Max dedutível
		double rebate = 0;
		double taxValue = 0;
		
		if ((medicalExpenses + educationalExpenses) > totalGrossTax) {
			deductibleExpenses = medicalExpenses + educationalExpenses;
			maxDeductible = totalGrossTax * 0.30 ;
			rebate = maxDeductible;
			taxValue = totalGrossTax - rebate;
		} else {
			deductibleExpenses = medicalExpenses + educationalExpenses;
			maxDeductible = totalGrossTax * 0.30 ;
			rebate = deductibleExpenses;
			taxValue = totalGrossTax - rebate;
		}
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		
		System.out.println("\n");
		
		System.out.println("CONSOLIDADO DE RENDA: ");
		System.out.printf("Imposto sobre salário: %.2f%n",  tax);
		System.out.printf("Imposto sobre serviços: %.2f%n", taxServiceProvision);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", taxCapitalGain);
		
		System.out.println("\n");
		
		System.out.println("DEDUÇÕES: ");
		System.out.printf("Máximo dedutível: %.2f%n", maxDeductible);
		System.out.printf("Gastos dedutíveis: %.2f%n", deductibleExpenses);
		
		System.out.println("\n");
		
		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: %.2f%n", totalGrossTax);
		System.out.printf("Abatimento: %.2f%n", rebate);
		System.out.printf("Imposto devido: %.2f%n", taxValue);
		
		sc.close();
	}

}
