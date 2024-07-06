package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		double soma = width * height;
		return soma;	
	}
	
	public double perimeter() {
		double soma = (width + height) * 2;
		return soma;
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
