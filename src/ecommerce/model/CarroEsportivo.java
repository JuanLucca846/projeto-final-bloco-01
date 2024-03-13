package ecommerce.model;

public class CarroEsportivo extends Carro {

	private int potencia;

	public CarroEsportivo(int id, int ano, int placa, String cor, String fabricante, int potencia) {
		super(id, ano, placa, cor, fabricante);

		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
