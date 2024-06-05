package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class soma_impares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			int subs = x;
			x = y;
			y = subs;
		}
		
		int soma = 0;
		for(int i=x+1;i<y;i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
			
		}
		System.out.printf("SOMA DOS IMPARES = %d\n", soma);
		
		
		sc.close();

	}

}
