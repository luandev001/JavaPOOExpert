package Estrutura_Condicional;

import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor:");
		valor1 = sc.nextInt();
		System.out.println("Segundo valor:");
		valor2 = sc.nextInt();
		System.out.println("Terceiro valor:");
		valor3 = sc.nextInt();
		
		if ((valor1 < valor2) & (valor1 < valor3)) {
			System.out.println("MENOR = " + valor1);
		}
		
		if((valor2 < valor1) && (valor2 < valor3)) {
			System.out.println("MENOR = "  + valor2);
		} else {
			System.out.println("MENOR = "  + valor3);
		}

		sc.close();
	}

}
