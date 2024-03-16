import java.util.Locale;

import javax.swing.JOptionPane;

public class Consumo {

	public static void main(String[] args) {
		double distancia, combustivelGasto, consumoMedio;
		
		
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Distância percorrida (em KM)"));
		Locale.setDefault(Locale.US);
		combustivelGasto = Double.parseDouble(JOptionPane.showInputDialog("Combustível gasto"));
		consumoMedio = distancia / combustivelGasto;
		
		System.out.printf("Distancia percorrida: %.0f%n",distancia);
		System.out.printf("Combustível gasto: %.1f%n", combustivelGasto);
		System.out.printf("Consumo Medio = %.3f%n", consumoMedio);
		
	}

}
