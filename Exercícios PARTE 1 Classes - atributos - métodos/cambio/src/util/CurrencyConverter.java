package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double convercaoDolar(double valorDolar, double dolarComprado) {// Quando é estático o atributo é
																					// passado como argumento.
		return valorDolar * dolarComprado * (1.0 + IOF);
	}

}
