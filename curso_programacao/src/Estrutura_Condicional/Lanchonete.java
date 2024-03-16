package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		int code, qtde_comprada;
		double valorUnit, valor_pagar;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Código do Produto: ");
		code = sc.nextInt();
		System.out.println("Codigo do produto comprado: " + code);
		qtde_comprada = sc.nextInt();
		System.out.println("Quantidade comprada: " + qtde_comprada);
		
		if ((code > 0) && (code < 6)) {
			switch(code) {
			case 1:
				valorUnit = 5.00;
				valor_pagar = qtde_comprada * valorUnit;
				System.out.printf("Valor a pagar: R$%.2f", valor_pagar);
				break;
			case 2:
				valorUnit = 3.50;
				valor_pagar = qtde_comprada * valorUnit;
				System.out.printf("Valor a pagar: R$%.2f", valor_pagar);
				break;
			case 3:
				valorUnit = 4.80;
				valor_pagar = qtde_comprada * valorUnit;
				System.out.printf("Valor a pagar: R$%.2f", valor_pagar);
				break;
			case 4:
				valorUnit = 8.90;
				valor_pagar = qtde_comprada * valorUnit;
				System.out.printf("Valor a pagar: R$%.2f", valor_pagar);
				break;
			case 5:
				valorUnit = 7.32;
				valor_pagar = qtde_comprada * valorUnit;
				System.out.printf("Valor a pagar: R$%.2f", valor_pagar);
				break;
			default:
				System.out.println("fim do programa!");
			}	
		} else {
			System.out.println("Códego Inesistente!");
		}
		
		sc.close();
		
	}

}
