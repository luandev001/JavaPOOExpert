package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		double X, Y;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de X: ");
		X = sc.nextDouble();
		
		System.out.println("Valor de Y: ");
		Y = sc.nextDouble();
		
		if ((X > 0) && (Y > 0)) {
			System.out.println("Q1");
		}
		
		else if ((X < 0) && (Y > 0)) {
			System.out.println("Q2");
		}
		
		else if ((X < 0) && (Y < 0)) {
			System.out.println("Q3");
		}
		
		else if ((X > 0) && (Y < 0)) {
			System.out.println("Q4");
		} 
		
		else if ((X > 0) && (Y == 0)) {
			System.out.println("Eixo X");
		}
		
		else if ((X == 0) && (Y > 0)) {
			System.out.println("Eixo Y");
		} else {
			System.out.println("Origem");
		}
			
		sc.close();
	}

}
