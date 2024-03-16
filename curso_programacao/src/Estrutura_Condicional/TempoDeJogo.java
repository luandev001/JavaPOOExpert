package Estrutura_Condicional;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		int horaInicial, horaFinal, duracao, dia;
		
		dia = 24;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora inicial: ");
		System.out.println("Hora Final: ");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial > horaFinal) {
			duracao = (dia - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		sc.close();
	}

}
