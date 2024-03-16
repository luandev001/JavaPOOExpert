package Estrutura_Condicional;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int num_1, num_2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois número inteitos: ");
		num_1 = sc.nextInt();
		num_2 = sc.nextInt();
		
		
		if (num_1 % num_2 == 0 || num_2 % num_1 == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
