package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int M = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int N = sc.nextInt();
		
		int[][] matA = new int[M][N];
		System.out.println("Digite os valores da matriz A:");
		for (int i=0; i<matA.length; i++) {
			for (int j=0; j<matA[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matA[i][j] = sc.nextInt();
			}
		}
		
		int[][] matB = new int[M][N];
		System.out.println("Digite os valores da matriz B:");
		for (int i=0; i<matB.length; i++) {
			for (int j=0; j<matB[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA: ");
		for (int i=0; i<M; i++) {	
			for (int j=0; j<N; j++) {
				System.out.print(matA[i][j] + matB[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
