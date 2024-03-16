import java.util.Locale;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		
		String nome;
		Double valorHora, total;
		int horasTrabalhadas;
		
		Locale.setDefault(Locale.US);
		nome = JOptionPane.showInputDialog("Nome do funcionário");
		
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor pago por hora"));
		
		horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas"));
		
		total = (Double) valorHora * horasTrabalhadas;
		
		System.out.println("nome: " + nome);
		System.out.printf("Valor por hora: %.2f%n", valorHora );
		System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		System.out.printf("O pagamento para %s deve ser %.2f%n", nome, total);

	}

}
