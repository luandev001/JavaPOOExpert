package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos contribuintes você vai digitar? ");
		int N = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.printf("Digite os dados do %dº contribuinte: \n", i + 1);
			System.out.print("Renda anual com salário: ");
			Double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			Double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double educationSpending = sc.nextDouble();

			TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending,
					educationSpending);
			list.add(taxPayer);
			 
		}

		System.out.println();
		
		for (TaxPayer t : list) {
				System.out.printf("Resumo do %dº contribuinte: \n",(list.indexOf(t)+ 1));
				System.out.printf("Imposto bruto total: %.2f \n", t.grossTax());
				System.err.printf("Abatimento: %.2f \n", t.taxRebate());
				System.out.printf("Imposto devido: %.2f \n", t.netTax());
				System.out.println();
		}
		
		sc.close();

	}

}
