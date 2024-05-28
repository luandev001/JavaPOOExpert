package Estruturas_repetitivas_while;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite as idades: ");
		double idade = sc.nextDouble();
		
		if (idade < 0) {
			System.out.println("IMPOSSÍVEL CALCULAR!");
		} else {
			
			int pessoa = 0;
			double soma = 0;
			while(idade >= 0) {
				soma = soma + idade;
				pessoa++;
				idade = sc.nextDouble();
			}
			
			double media = soma / pessoa;
			System.out.printf("MEDIA = %.2f\n", media);
		}
		
		sc.close();

	}

}
