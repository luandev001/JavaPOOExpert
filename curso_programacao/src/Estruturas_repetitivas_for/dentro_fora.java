package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero:");
			int x = sc.nextInt();
			
			if(x >=10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}

		}
		
		System.out.printf("%d DENTRO\n", dentro);
		System.out.printf("%d FORA", fora);
			
		sc.close();

	}

}
