package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students students = new Students();
		
		students.name = sc.nextLine();
		students.notaA = sc.nextDouble();
		students.notaB = sc.nextDouble();
		students.notaC = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", students.notaFinal());
		
		if(students.notaFinal() < 60.00) {		
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f PONTOS", students.pontosFaltantes());
		} else 
			System.out.println("PASS");
		sc.close();

	}

}
