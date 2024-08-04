package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion championA;
		Champion championB;

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();

		championA = new Champion(name, life, attack, armor);
		System.out.println();

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		championB = new Champion(name, life, attack, armor);
		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		System.out.println();

		int turno = 0;
		while (turno < n && championA.getLife() != 0 && championB.getLife() != 0) {

			turno++;

			championA.takeDamege(championB);
			championB.takeDamege(championA);

			System.out.println("Resultado do turno " + turno + ":");
			System.out.println(championA.status());
			System.out.println(championB.status());
			System.out.println();

		}

		System.out.println("FIM DO COMBATE");
		sc.close();

	}

}
