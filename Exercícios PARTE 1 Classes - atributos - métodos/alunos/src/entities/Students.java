package entities;

public class Students {

	public String name;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double notaFinal() {
		return notaA + notaB + notaC;
	}
	
	public double pontosFaltantes() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
