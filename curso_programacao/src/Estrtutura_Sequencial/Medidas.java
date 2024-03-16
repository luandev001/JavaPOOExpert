package Estrtutura_Sequencial;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Medidas {

	public static void main(String[] args) {
		double a, b, c, quadrado, triangulo, trapezio;
		
		Locale.setDefault(Locale.US);
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida B"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida C"));
		
		quadrado = Math.pow(a, 2);
		triangulo = (a * b) / 2;
		trapezio = ((a + b) * c) / 2;
		
		System.out.printf("AREA DO QUADRADO = %.4f%n", quadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", triangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n", trapezio);
		
		

	}

}
