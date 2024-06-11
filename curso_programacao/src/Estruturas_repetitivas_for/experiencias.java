package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int n = sc.nextInt();
		
		int sapo, rato, coelho, cobaia, totalCobaias;
		double psapo, prato, pcoelho;
		char tipo;
		
		sapo = 0;
		rato = 0;
		coelho = 0;
		
		for(int i=0; i<n;i++) {
			System.out.print("Quantidade de cobaias: ");
			cobaia = sc.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			if(tipo == 'C') {
				coelho += cobaia;
			}
			
			else if (tipo == 'S') {
				sapo += cobaia;
			}
			
			else if (tipo == 'R'){
				rato += cobaia;
			}
			
		}
		
		totalCobaias = rato + sapo + coelho;
		
		psapo = ((double) sapo / totalCobaias) * 100.0;	
		prato = ((double) rato / totalCobaias) * 100.0;
		pcoelho = ((double) coelho / totalCobaias) * 100.0;
		
		System.out.println("\nRELATORIO FINAL:");
		
		System.out.printf("Total: %d cobaias \n", totalCobaias);
		System.out.printf("Total de coelhos: %d\n", coelho);
		System.out.printf("Total de ratos: %d\n", rato);
		System.out.printf("Total de sapos: %d\n", sapo);
		System.out.printf("Percentual de coelhos: %.2f\n", pcoelho);
		System.out.printf("Percentual de ratos: %.2f\n", prato);
		System.out.printf("Percentual de sapos: %.2f\n", psapo);
		
		sc.close();
	}

}
