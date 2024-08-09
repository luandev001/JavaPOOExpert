package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for (int i=0; i < pessoas.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa:\n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			pessoas[i] = new Pessoa(name, age, height);
		}
		
		double sum = 0.0;
		int nMenor = 0;
		for(int i=0; i < pessoas.length; i++) {
			sum += pessoas[i].getHeight();
		}
		
		for(int i=0; i < pessoas.length; i++) {
			if(pessoas[i].getAge() < 16) {
				nMenor++;
			}
		}
		
		double avg = sum / pessoas.length;
		double persentagem = ((double)nMenor / n) * 100;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", persentagem);
		if(nMenor > 0) {
			for(int i=0; i<pessoas.length; i++) {
				if(pessoas[i].getAge() < 16) {
					System.out.printf("%s\n", pessoas[i].getName());
				}
			}
		}
		
		sc.close();

	}

}
