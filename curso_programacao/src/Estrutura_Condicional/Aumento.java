package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		double salario, aumento, soma, porcentagem;
		int valor_porcentagem;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if(salario <= 1000) {
			porcentagem = 0.20;
			valor_porcentagem = (int) (100 * porcentagem);
			aumento = salario * porcentagem;
			soma = salario + (salario * porcentagem);
			System.out.printf("Novo salario = R$ %.2f\n", soma);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem = " + valor_porcentagem + "%");
		} 
		
		else if ((salario > 1000) && (salario <= 3000)) {
			porcentagem = 0.15;
			valor_porcentagem = (int) (100 * porcentagem);
			aumento = salario * porcentagem;
			soma = salario + (salario * porcentagem);
			System.out.printf("Novo salario = R$ %.2f\n", soma);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem = " + valor_porcentagem + "%");
		}
		
		else if((salario > 3000) && (salario <= 8000)) {
			porcentagem = 0.10;
			valor_porcentagem = (int) (100 * porcentagem);
			aumento = salario * porcentagem;
			soma = salario + (salario * porcentagem);
			System.out.printf("Novo salario = R$ %.2f\n", soma);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem = " + valor_porcentagem + "%");
			
		} else {
			porcentagem = 0.05;
			valor_porcentagem = (int) (100 * porcentagem);
			aumento = salario * porcentagem;
			soma = salario + (salario * porcentagem);
			System.out.printf("Novo salario = R$ %.2f\n", soma);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem = " + valor_porcentagem + "%");
		}
			
		
		sc.close();

	}

}
