package Estrtutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		double largura_terreno, comprimento_terreno, valor_metroQuadrado;
		double area, preco;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		largura_terreno = s.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento_terreno = s.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		valor_metroQuadrado = s.nextDouble();
		Locale.setDefault(Locale.US);
		System.out.printf("Digite a largura do terreno: %.1f%n", largura_terreno);
		System.out.printf("Digite o comprimento do terreno: %.1f%n", comprimento_terreno);
		System.out.printf("Digite o valor do metro quadrado: %.2f%n", valor_metroQuadrado);
		area = largura_terreno * comprimento_terreno;
		System.out.printf("Area do terreno = %.2f%n", area);
		preco = valor_metroQuadrado * area;
		System.out.printf("Preço do terreno = %.2f%n", preco);
		
		s.close();
		

	}

}
