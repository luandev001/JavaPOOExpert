package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		// R$ 50,00 por 100 minutos.
		// Cada minuto excedente a 100min custa R$ 2,00.
		
		int qtd_minuto ;
		double pacote_padrao;
		
		//excedente, valor_pagar ;
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite a quantidade de minutos: ");
		
		Scanner sc = new Scanner(System.in);
		qtd_minuto = sc.nextInt();
		
		pacote_padrao = 50.0;
		
		if (qtd_minuto > 100) {
			pacote_padrao += (qtd_minuto  - 100) * 2.0;	
			
			/**System.out.println(valor_pagar);
			*excedente = valor_pagar + pacote_padrao;
			*/
			//System.out.printf("Consumo excedeu contidade de minutos contratada, valor a ser pago R$ %.2f%n", pacote_padrao);
			
		}
		
		System.out.printf("Consumo excedeu contidade de minutos contratada, valor a ser pago R$ %.2f%n", pacote_padrao);
		
		/* else {	
			System.out.printf("Pacote não foi totalmente consumido, valor a pagar: R$ %.2f%n", pacote_padrao);
		}*/
		
		sc.close();
		
	}

}
