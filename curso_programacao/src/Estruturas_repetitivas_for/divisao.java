package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		double numerador, denominador, divisao;
		
		for(int i=0; i<n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextDouble();
			
			if (denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				divisao = numerador / denominador;
				System.out.printf("DIVISAO = %.2f\n", divisao);
			}
			
		}

		sc.close();

	}

}
