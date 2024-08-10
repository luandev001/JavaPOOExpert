package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A: ");
		int[] vetorA = new int[n];
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		int[] vetorB = new int[n];
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		int[] vetorC = new int [n];
		int sum = 0;
		for(int i=0; i<vetorC.length; i++) {
			sum = vetorA[i] + vetorB[i];
			System.out.println(sum);
		}
		
		sc.close();

	}

}
