import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		
		double raio, area;
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor do raio do circulo: ");
		Scanner  r = new Scanner(System.in);
		raio = r.nextDouble();
		
		area = Math.PI * (Math.pow(raio, 2));
		
		System.out.printf("Digite o valor do raio do circulo: %.1f%n", raio);
		System.out.printf("AREA = %.3f%n", area);
		
		r.close();
	}

}
