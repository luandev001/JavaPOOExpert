package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class Atletas_Java {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, nomeMaisAlto;
		char sexo;
		double altura, peso, peso_media, alturaMulher, alturaMediaMulher, maisAlto, somaPeso, porcentagem;
		int mulher, homem;
		
		mulher=0;
		homem=0;
		maisAlto=0;
		somaPeso = 0;
		peso=0;
		alturaMulher = 0;
		nomeMaisAlto = "";
		
		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n <= 0) {
			System.out.println("Qual a quantidade de atletas?");
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite os dados do atleta numero " + i + ":");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			
			while(sexo != 'F'  && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while(altura <=0 ) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			sc.nextLine();
			while(peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			
			if(altura > maisAlto ) {
				maisAlto = altura;
				nomeMaisAlto = nome;
			}

			if (sexo == 'F') {
				mulher++;
				
				alturaMulher = alturaMulher + altura;
			} 
			
			else if (sexo == 'M'){
				homem++;
			}	
			
			somaPeso = somaPeso + peso;
					
		}
		
		if(n <= 1) {
			peso_media = peso;
		} else {
			peso_media = somaPeso / n;
		}
		
		alturaMediaMulher = alturaMulher / mulher;
		
		porcentagem = (double) homem / (homem + mulher) * 100.0;	
		
		System.out.println("\n");
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", peso_media);
		System.out.printf("Atleta mais alto: %s%n", nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagem);
		if(mulher >= 1) {
			System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulher);		
		}
		
		if(mulher == 0) {
			System.out.println("Não há mulheres cadastradas");
		}
		
		sc.close();

	}

}
