package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.CarroController;
import ecommerce.model.CarroEsportivo;

public class menu {

	public static void main(String[] args) {

		CarroController carro = new CarroController();

		int opcao, id, ano, placa, potencia;
		String cor, fabricante;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("*		LOJA DE CARROS	 		    *");
			System.out.println("*****************************************************");
			System.out.println("*	Digite 1 para - Adicionar um novo carro	    *");
			System.out.println("*	Digite 2 para - Listar todos os carros	    *");
			System.out.println("*	Digite 3 para - Atualizar os dados do carro *");
			System.out.println("*	Digite 4 para - Apagar um carro da lista    *");
			System.out.println("*	Digite 9 para - Encerrar		    *");
			System.out.println("*****************************************************");
			System.out.println("*    		Entre com a opção desejada:  	    *");
			System.out.println("*****************************************************");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite uma opção valida!\n");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("Programa encerrado");
				sobre();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\nAdicionar um novo carro: \n");
				System.out.println("Digite o ano do carro: ");
				ano = scanner.nextInt();
				System.out.println("Digite a placa do carro: ");
				placa = scanner.nextInt();
				System.out.println("Digite a cor do carro: ");
				scanner.skip("\\R?");
				cor = scanner.nextLine();
				System.out.println("Digite o fabricante do carro: ");
				scanner.skip("\\R?");
				fabricante = scanner.nextLine();
				System.out.println("Digite a potencia do carro: ");
				potencia = scanner.nextInt();

				carro.cadastrarCarro(new CarroEsportivo(carro.gerarID(), ano, placa, cor, fabricante, potencia));
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todos os carros: \n");
				carro.listarTodosCarros();
				keyPress();
				break;
			case 3:
				System.out.println("\nAtualizar carro: \n");
				System.out.println("Digite o ID d ocarro: ");
				id = scanner.nextInt();
				var buscarCarro = carro.buscarPorID(id);
				if (buscarCarro != null) {
					System.out.println("Digite o ano do carro: ");
					ano = scanner.nextInt();
					System.out.println("Digite a placa do carro: ");
					placa = scanner.nextInt();
					System.out.println("Digite a cor do carro: ");
					scanner.skip("\\R?");
					cor = scanner.nextLine();
					System.out.println("Digite o fabricante do carro: ");
					scanner.skip("\\R?");
					fabricante = scanner.nextLine();
					System.out.println("Digite a potencia do carro: ");
					potencia = scanner.nextInt();

					carro.atualizarCarro(new CarroEsportivo(id, ano, placa, cor, fabricante, potencia));
				}
				keyPress();
				break;
			case 4:
				System.out.println("\nRemover carro: \n");
				System.out.println("Digite o ID do carro: ");
				id = scanner.nextInt();

				carro.removerCarro(id);
				keyPress();
				break;

			}
		}

	}

	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("*    		Projeto desenvolvido por: Juan Lucca*");
		System.out.println("*    		lucca470@gmail.com  	            *");
		System.out.println("*    		https://github.com/JuanLucca846     *");
		System.out.println("*****************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
