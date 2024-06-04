package Estruturas_repetitivas_while;

import java.util.Locale;
import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
		int cod = sc.nextInt();
		
		while (cod < 1 && cod > 4) {
			System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();
		}
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
				
		while (cod != 4) {
			if (cod == 1) {
				alcool += 1;
			}
			
			else if (cod == 2) {
				gasolina += 1;
			}
			
			else if (diesel == 3){
				diesel += 1;
			}
			
			System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
