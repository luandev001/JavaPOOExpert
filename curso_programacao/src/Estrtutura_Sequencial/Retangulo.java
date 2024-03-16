package Estrtutura_Sequencial;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Retangulo {

	public static void main(String[] args) {
		double base, altura, area, perimetro, diagonal;
		 
		base = Double.parseDouble(JOptionPane.showInputDialog("Base do angulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura retangulo"));
		area = base * altura;
		perimetro = (base + base) + (altura + altura);
		diagonal = Math.sqrt(base*base + altura*altura);

		Locale.setDefault(Locale.US);
		System.out.printf("Base do retangulo: %.1f%n", base);
		System.out.printf("Altura do retangulo: %.1f%n", altura);
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
	}

}
