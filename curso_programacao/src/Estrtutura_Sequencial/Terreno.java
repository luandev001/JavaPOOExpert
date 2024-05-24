package Estrtutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Terreno {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		double largura_terreno = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento_terreno = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double valor_metroQuadrado = sc.nextDouble();
		
		System.out.printf("Digite a largura do terreno: %.1f%n", largura_terreno);
		System.out.printf("Digite o comprimento do terreno: %.1f%n", comprimento_terreno);
		System.out.printf("Digite o valor do metro quadrado: %.2f%n", valor_metroQuadrado);
		double area = largura_terreno * comprimento_terreno;
		System.out.printf("Area do terreno = %.2f%n", area);
		double preco = valor_metroQuadrado * area;
		System.out.printf("Preço do terreno = %.2f%n", preco);
		
		sc.close();
		

	}

}
