package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		for(int i=0; i<name.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
			name[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		double sum = 0.0;
		for(int i=0; i<name.length; i++) {
			sum = nota1[i] + nota2[i];
			double avg = sum / 2;
			if(avg >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
