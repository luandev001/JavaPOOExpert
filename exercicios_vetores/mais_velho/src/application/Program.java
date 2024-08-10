package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		int maisVelho = 0;
		String nameMaisVelho = "";
		for(int i=0; i<age.length; i++) {
			if(age[i] > maisVelho) {
				maisVelho = age[i];
				nameMaisVelho = name[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nameMaisVelho);
		
		sc.close();

	}

}
