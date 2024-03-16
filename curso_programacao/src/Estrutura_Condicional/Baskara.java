package Estrutura_Condicional;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Baskara {

	public static void main(String[] args) {
		
		double a, b, c, x1, x2, delta;
		
		Locale.setDefault(Locale.US);
		a = Double.parseDouble(JOptionPane.showInputDialog("Coeficiente a:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Coeficiente b:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Coeficiente c:"));
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0) {
			System.out.println("Esta equação não possui raizes reais");
		} else {
			x1 = ((-b) + Math.sqrt(delta)) / (2*a);
			x2 = ((-b) - Math.sqrt(delta)) / (2*a);
			
			System.out.printf("X1 = %.4f%n",x1);
			System.out.printf("X1 = %.4f%n",x2);
		}
	}

}
