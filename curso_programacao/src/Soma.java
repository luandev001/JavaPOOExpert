import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		int x, y, soma;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
		
		soma = x + y;
		
		System.out.println("Digite o valor de X: " + x);
		System.out.println("Digite o valor de Y: " + y);
		System.out.println("SOMA = " + soma);

	}

}
