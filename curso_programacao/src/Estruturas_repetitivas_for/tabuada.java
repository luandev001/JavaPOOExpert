package Estruturas_repetitivas_for;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int soma = n * i;
			System.out.println(n + " x " + i + " = " + soma);
		}
		
		sc.close();

	}

}
