package Estrutura_Condicional;

import java.util.Locale;

import javax.swing.JOptionPane;

public class troco_verificado {

	public static void main(String[] args) {
		// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.

		// O programa deve ler o preço unitário do produto.
		// A quantidade de unidades compradas deste produto.		
		// Valor em dinheiro dado pelo cliente.
		//  Seu programa deve mostrar o valor do troco a ser devolvido ao cliente
		//  Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o valor restante
		double precoUnitario, DinheiroCliente, troco, total, diferenca;
		int qtdComprada;
		
		Locale.setDefault(Locale.US);
		precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Preço unitário do produto: "));
		System.out.println("Preço unitário do produto: " + precoUnitario);
		
		qtdComprada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade comprada: "));
		System.out.println("Quantidade comprada: " + qtdComprada);
		
		DinheiroCliente = Double.parseDouble(JOptionPane.showInputDialog("Dinheiro recebido: "));
		System.out.println("Dinheiro recebido: " + DinheiroCliente);
		
		total = precoUnitario * qtdComprada;
		
		troco = DinheiroCliente - total ;
		
		diferenca = total - DinheiroCliente;
		
		if (DinheiroCliente < total) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f%n REAIS", diferenca);
		} else {
			System.out.printf("TROCO = %.2f%n ", troco);
		}
	}

}
