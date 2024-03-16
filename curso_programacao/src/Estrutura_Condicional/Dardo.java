package Estrutura_Condicional;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Dardo {

	public static void main(String[] args) {
		// Programa para medir maior distância
		
		Double dist1, dist2, dist3;
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite as tres distancias: ");
		dist1 = Double.parseDouble(JOptionPane.showInputDialog("Distância 1"));
		System.out.println(dist1);
		
		dist2 = Double.parseDouble(JOptionPane.showInputDialog("Distância 2"));
		System.out.println(dist2);
		
		dist3 = Double.parseDouble(JOptionPane.showInputDialog("Distância 3"));
		System.out.println(dist3);
		
		if (dist1 > dist2 && dist1 > dist3) {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", dist1);
		} else if (dist2 > dist1 && dist2 > dist3) {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", dist2);
		} else {
			System.out.printf("MAIOR DISTANCIA = %.2f%n", dist3);
		}

	}

}
