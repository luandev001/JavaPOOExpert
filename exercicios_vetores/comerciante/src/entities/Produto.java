package entities;

public class Produto {

	private String name;
	private double precoCompra;
	private double precoVenda;
	
	public Produto(String name, double precoCompra, double precoVenda) {
		this.name = name;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + "]";
	}
	
	
}
