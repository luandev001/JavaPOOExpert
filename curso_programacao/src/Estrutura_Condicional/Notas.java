package Estrutura_Condicional;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		double nota_1, nota_2, notaFinal;
		
		Locale.setDefault(Locale.US);
		nota_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota"));
		nota_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota"));
		notaFinal = nota_1 + nota_2;
		
		System.out.println("Digite a primeira nota: " + nota_1);
		System.out.println("Digite a segunda nota: " + nota_2);
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60) {
			System.out.println("REPROVADO");
		}
	}

}
