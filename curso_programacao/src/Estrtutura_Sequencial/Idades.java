package Estrtutura_Sequencial;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Idades {

	public static void main(String[] args) {
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		Locale.setDefault(Locale.US);
		System.out.println("Dados da primeira pessoa: ");
		nome1 = JOptionPane.showInputDialog("Digite o primeiro nome");
		System.out.println("Nome: " + nome1);
		idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira idade "));
		System.out.println("Idade: " + idade1);
		
		System.out.println("Dados da segunda pessoa: ");
		nome2 = JOptionPane.showInputDialog("Digite o segundo nome");
		System.out.println("Nome: " + nome2);
		idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade "));
		System.out.println("Idade: " + idade2);
		
		media = ((double) idade1 + idade2) / 2;

		System.out.printf("A idade média de %s e %s é de %.1f anos ", nome1, nome2, media);

	}

}
