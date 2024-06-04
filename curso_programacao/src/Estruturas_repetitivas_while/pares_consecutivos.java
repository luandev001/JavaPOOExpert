package Estruturas_repetitivas_while;

import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();
		int soma = 0;
		while(x != 0) {
			if (x % 2 != 0) {
				x += 1;
			}
			
			soma = 5 * x + 20;
			
			System.out.printf("SOMA = %d\n", soma);
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
			
		}
		
		
		
		sc.close();

	}

}
