package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		double [][] mat = new double[N][N];
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double sumPos = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] > 0) {
					sumPos += mat[i][j];
				}
			}
		}
		
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n", sumPos);
		
		System.out.print("\nEscolha uma linha: ");
		int linEsc = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[linEsc][i]);
		}
		
		System.out.print("\n\nEscolha uma coluna: ");
		int colEsc = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[i][colEsc]);
		}
		
		System.out.print("\n\nDIAGONAL PRINCIPAL: ");
		for (int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		
		for (int i=0; i<N; i++ ) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2); 
				}
			}
		}
		
		System.out.println("\n\nMATRIZ ALTERADA:");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
