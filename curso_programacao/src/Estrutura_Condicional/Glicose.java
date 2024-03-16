package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		
		double glicose;
		
		// Normal Até 100 mg/dl
		
		// Elevado Maior que 100 até 140 mg/dl
		
		// Diabetes Maior de 140 mg/dl
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite a medida da glicose: ");
		Scanner sc = new Scanner(System.in);
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Classificacao: normal");
		} else if ((glicose > 100) && (glicose <= 140)) {
			System.out.println("Classificacao: elevado");
		} else {
			System.out.println("Classificacao: diabetes");
		}
		
		sc.close();
	}

}
