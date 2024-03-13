package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Carro;
import ecommerce.repository.CarroRepository;

public class CarroController implements CarroRepository {

	private ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	int id = 0;

	@Override
	public void cadastrarCarro(Carro carro) {
		listaCarros.add(carro);
		System.out.println("\nCarro adicionado com sucesso!");
	}

	@Override
	public void listarTodosCarros() {
		for (var carro : listaCarros) {
			carro.listarCarros();
		}

	}

	@Override
	public void atualizarCarro(Carro carro) {
		var buscarCarro = buscarPorID(carro.getId());

		if (buscarCarro != null) {
			listaCarros.set(listaCarros.indexOf(buscarCarro), carro);
			System.out.println("\nCarro atualizado com sucesso");
		} else {
			System.out.println("\nCarro não foi encontrado");
		}

	}

	@Override
	public void removerCarro(int id) {
		var carro = buscarPorID(id);

		if (carro != null) {
			if (listaCarros.remove(carro) == true) {
				System.out.println("\nCarro removido com sucesso");
			}
		} else {
			System.out.println("\nCarro não foi encontrado");
		}

	}

	public int gerarID() {
		return ++id;
	}

	public Carro buscarPorID(int id) {
		for (var carro : listaCarros) {
			if (carro.getId() == id) {
				return carro;
			}
		}
		return null;
	}

}
