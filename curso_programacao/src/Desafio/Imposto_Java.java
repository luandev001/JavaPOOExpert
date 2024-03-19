package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_Java {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Renda anual com salário: ");
		double incomeAnnual = sc.nextDouble(); //Renda anual
		
		System.out.println("Renda anual com prestação de serviço: ");
		double serviceProvision = sc.nextDouble();//pretação de serviço
		
		System.out.println("Renda anual com ganho de capital: ");
		double capitalGain = sc.nextDouble();  // Ganho de capital
		
		System.out.println("Gastos médicos: ");
		double medicalExpenses = sc.nextDouble();  // Gastos médico
		
		System.out.println("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble();  // Gastos educacionais
		
		
		
		
		
		sc.close();
	}

}
