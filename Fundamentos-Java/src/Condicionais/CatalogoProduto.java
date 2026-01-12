package Condicionais;

import java.util.Scanner;

public class CatalogoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String produto1 = "CPU";
		String produto2 = "RAM";
		String produto3 = "GPU";

		double preco = 0;

		System.out.println("Digite o nome do produto!");
		String pesquisa = input.nextLine();

		if (pesquisa.equalsIgnoreCase("CPU") || pesquisa.equalsIgnoreCase("RAM") || pesquisa.equalsIgnoreCase("GPU")) {

			System.out.println("Produto esta catalogado, deseja alterar o preco? ");
			System.out.println("Digite Y para Sim e N para Nao ");
			String opcao = input.nextLine();

			if (opcao.equalsIgnoreCase("y")) {

				System.out.println("Digite o novo valor!!");
				preco = input.nextDouble();

			} else if (opcao.equalsIgnoreCase("n")) {
				System.out.println("Obrigado pela visita, encerrando o programa!");
				input.close();
				return;
			} else {
				
			}

		} else {

			System.out.println("Produto nao existe! informe o preco!");
			preco = input.nextDouble();
		}

		if (preco < 50) {

			System.out.println("esta barato");
		} else if (preco >= 50 && preco <= 100) {
			System.out.println("esta com o preco ideal");

		} else {
			System.out.println("esta caro!");
		}
		
		System.out.println("Produto " + pesquisa + " Preco " + preco);

		input.close();

	}

}
