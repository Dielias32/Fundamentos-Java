package Funcoes;

import java.util.Scanner;

public class CtVesaoDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Conversor de temperatura");
		System.out.println("Digite 1 para ver em F°");
		System.out.println("Digite 2 para ver em C°");

		int entrada = input.nextInt();

		if (entrada != 1 && entrada != 2) {
			System.out.println("Entrada Invalida!");
			System.out.println("!!!Saindo!!!");
		} else if (entrada == 1) {
			System.out.println("Digite a temperatura em C°");
			double temp = input.nextDouble();
			temperaturaC(temp);

		} else {

			System.out.println("Digite a temperatura em F°");
			double temp = input.nextDouble();
			temperaturaF(temp);
		}

		input.close();
	}

	public static void temperaturaC(double temperatura) {

		double conversao = (temperatura * 9 / 5) + 32;

		System.out.println("Essa temperatura em F° é: " + conversao);

	}

	public static void temperaturaF(double temperatura) {

		double conversao = (temperatura - 32) * 5 / 9;
		System.out.println("Essa temperatura em C° é: " + conversao);
	}

}
