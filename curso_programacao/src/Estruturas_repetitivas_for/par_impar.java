package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			int valor = sc.nextInt();
			
			if (valor == 0) {
				System.out.println("NULO");
			}

			else if(valor % 2 != 0) {
				if(valor < 0) {
					System.out.println("IMPAR NEGATIVO");
				} else {
					System.out.println("IMPAR POSITIVO");
				}
			} else {
				if (valor < 0) {
					System.out.println("PAR NEGATIVO");
				} else {
					System.out.println("PAR");
				}
			}
		}
		
		sc.close();

	}

}
