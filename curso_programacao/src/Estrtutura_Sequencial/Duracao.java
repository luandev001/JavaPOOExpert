package Estrtutura_Sequencial;
import javax.swing.JOptionPane;

public class Duracao {

	public static void main(String[] args) {
		
		int duracao, hora, minuto, segundo, resto;
		
		duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração em segundos"));
		
		hora = duracao / 3600;
		resto = duracao % 3600;
		minuto = resto / 60;
		segundo = resto % 60;
		
		System.out.println("Digite a duração em segundos: " + duracao);
		System.out.println(hora + ":" + minuto + ":" + segundo);

	}

}
