package Estrtutura_Sequencial;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Troco {

	public static void main(String[] args) {
		double valor_unit, dinheiro_cliente, troco;
		int qtde_prod;

		Locale.setDefault(Locale.US);
		valor_unit = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario do produto"));
		qtde_prod = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada"));
		dinheiro_cliente = Double.parseDouble(JOptionPane.showInputDialog("Valor recebido"));
	
		troco = dinheiro_cliente - ((double)valor_unit * qtde_prod) ;
		
		System.out.printf("Preço unitário do produto: %.2f%n", valor_unit);
		System.out.println("Quantidade comprada: " + qtde_prod);
		System.out.printf("Dinheiro recebido: %.2f%n", dinheiro_cliente);
		System.out.printf("TROCO = %.2f%n", troco);
		
	}

}
