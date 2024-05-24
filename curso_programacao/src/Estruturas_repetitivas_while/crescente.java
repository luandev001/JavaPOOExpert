package Estruturas_repetitivas_while;

import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		while( x != y ) {

			if (x > y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite dois numeros: ");
			 x = sc.nextInt();
			 y = sc.nextInt();
		}
		
		System.out.println("Fim do programa!");

		sc.close();

	}

}
