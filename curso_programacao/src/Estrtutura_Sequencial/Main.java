package Estrtutura_Sequencial;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		
		String nome = "Luan";
		int idade = 28;
		double renda = 10000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n" , nome, idade, renda);
		

	}

}
