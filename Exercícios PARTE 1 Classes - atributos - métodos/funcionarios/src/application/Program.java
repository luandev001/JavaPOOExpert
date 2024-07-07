package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employees employees = new Employees();
		
		System.out.println("Nome: ");
		employees.name = sc.nextLine();
		System.out.println("Salário bruto: ");
		employees.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		employees.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + employees);
		System.out.println();
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		employees.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + employees);
		
		
		
		sc.close();

	}

}
