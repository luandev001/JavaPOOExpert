package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n =sc.nextInt();
		
		Produto[] produto = new Produto[n];
		for(int i=0; i <produto.length; i++) {
			System.out.printf("Produto %d: \n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco de compra: ");
			double precoCompra = sc.nextDouble();
			System.out.print("Preco de venda: ");
			double precoVenda = sc.nextDouble();
			produto[i] = new Produto(name, precoCompra, precoVenda);
		}
		
		double somaCompra = 0.0;
		double somaVenda = 0.0;
		for(int i=0; i <produto.length; i++ ) {
			somaCompra += produto[i].getPrecoCompra();
			somaVenda += produto[i].getPrecoVenda();
		}
		
		double lucroT = somaVenda - somaCompra; 
		double[] porcentagemLucro = new double[n];
		for(int i=0; i<porcentagemLucro.length; i++) {
			porcentagemLucro[i] = (produto[i].getPrecoVenda() - produto[i].getPrecoCompra()) / produto[i].getPrecoCompra() * 100.00;
		}
		
		int lucroAbaixo_10 = 0;
		int lucroEntre_10_e_20 = 0;
		int lucroAcima_20 = 0;
		for(int i=0; i<produto.length; i++) {
			if(porcentagemLucro[i] < 10.0) {
				lucroAbaixo_10++;					
			}
			
			else if(porcentagemLucro[i] < 20.0) {
				lucroEntre_10_e_20++;
			}
			
			else {
				lucroAcima_20++;
			}
		}
	
		System.out.println();
		System.out.println("RELATORIO: ");
		System.out.printf("Lucro abaixo de 10%%: %d%n", lucroAbaixo_10);
		System.out.printf("Lucro entre 10%% e 20%%: %d%n", lucroEntre_10_e_20);
		System.out.printf("Lucro acima de 20%%: %d%n", lucroAcima_20);
		System.out.printf("Valor total de compra: %.2f%n", somaCompra);
		System.out.printf("Valor total de venda: %.2f%n", somaVenda);
		System.out.printf("Lucro total: %.2f%n", lucroT);
		
		
		sc.close();

	}

}
