package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		for(int i=0; i <altura.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for(int i=0; i<altura.length; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		double sum = 0.0;
		int contagemMulher = 0;
		int contHomem = 0;
		for(int i=0; i<altura.length; i++) {
			if(genero[i] == 'F') {
				sum += altura[i];
				contagemMulher++;
			} else {
				contHomem++;
			}
		}
		
		double avgMulher = (double)sum / contagemMulher;
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", avgMulher);
		System.out.printf("Numero de homens = %d", contHomem);
		
		sc.close();

	}

}
