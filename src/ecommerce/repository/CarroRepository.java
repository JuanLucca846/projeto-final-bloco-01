package ecommerce.repository;

import ecommerce.model.Carro;

public interface CarroRepository {

	public void cadastrarCarro(Carro carro);

	public void listarTodosCarros();

	public void atualizarCarro(Carro carro);

	public void removerCarro(int id);

}
