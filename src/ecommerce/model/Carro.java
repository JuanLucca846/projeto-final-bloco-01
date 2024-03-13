package ecommerce.model;

public class Carro {

	private int id;
	private int ano;
	private int placa;
	private String cor;
	private String fabricante;

	public Carro(int id, int ano, int placa, String cor, String fabricante) {
		this.id = id;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void listarCarros() {
		System.out.println("ID: " + this.id);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cor: " + this.cor);
		System.out.println("Fabricante: " + this.fabricante + "\n");

	}

}
