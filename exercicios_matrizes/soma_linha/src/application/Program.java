package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int M = sc.nextInt();
		while(M >=10 ) {
			System.out.println("máximo = 10");
			System.out.print("Qual a quantidade de linhas da matriz? ");
			M = sc.nextInt();
		}
		
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int N = sc.nextInt();
		while(N >=10 ) {
			System.out.println("máximo = 10");
			System.out.print("Qual a quantidade de colunas da matriz? ");
			M = sc.nextInt();
		}
		
		double[][] mat = new double[M][N];
		double[] vect = new double[M];
		
		for (int i=0; i<M; i++) {
			System.out.printf("Digite os elementos da %dº linha: %n", i+1);
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double sum;
		for (int i=0; i<M; i++) {
			sum=0;
			for(int j=0; j<N; j++) {
				sum += mat[i][j];
			}
			vect[i] = sum;
		}
		
		System.out.println("VETOR GERADO:");
		for (int i=0; i<M; i++) {
			System.out.printf("%.1f%n", vect[i]);
		}
		
		sc.close();

	}

}
