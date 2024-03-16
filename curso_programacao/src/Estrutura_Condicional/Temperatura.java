package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;


public class Temperatura {

	public static void main(String[] args) {
		
		double Celsius, Fahrenheit, Graus;
		char conversao;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		
		Scanner sc = new Scanner(System.in);
		
		//Para pegar apenas o primeiro catactere
		conversao = sc.next().charAt(0);
		
		
		if (conversao == 'C') {
			
			System.out.println("Digite a temperatura em Celsius:");
			Graus = sc.nextDouble();
			Fahrenheit = (Graus * 1.8) + 32.0;
			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", Fahrenheit);
		}
		
		else if(conversao == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit:");
			Graus = sc.nextDouble();
			Celsius = 5.0/9.0 * (Graus-32.0);
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", Celsius);
		} 
		
		else {
			System.out.println("Opção Não encontrada!	");
		}
		
		sc.close();
	}

}
