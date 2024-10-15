package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N =sc.nextInt();
		
		int[][] mat = new int[N][N];
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		int acimaDiagonal =0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (i<j) {
					acimaDiagonal += mat[i][j];
				}
			}
		}
		
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + acimaDiagonal);
		
		sc.close();
	}

}
