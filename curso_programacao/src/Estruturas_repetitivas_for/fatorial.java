package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		while(n > 15) {
			System.out.println("Digite o valor de N: ");	
			n = sc.nextInt();
		}
		
		int fatorial = 1;
	
		for(int i=n; i>0; i--) {

			fatorial = fatorial * i;
			
		}
		System.out.printf("FATORIAL = %d\n", fatorial);
		
		sc.close();

	}

}
