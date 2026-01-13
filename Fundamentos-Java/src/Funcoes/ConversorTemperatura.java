package Funcoes;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Bem vindo ao conversor de temperatura!");
		System.out.println(
				"Como quer a conversao? Digite 1 para converter C° para F° OU digite dois para converter de F° para C°");

		int entrada = input.nextInt();

		if (entrada != 1 && entrada != 2) {

			System.out.println(
					"Entrada invalida, digite 1 para converter C° para F° OU digite 2 para converter de F° para C°");
			System.out.println("!!!!!!Saindo do programa!!!!!!");
			input.close();
			return;
		}

		switch (entrada) {
		case 1:
			System.out.println("Digite a temperatura em C°");

			double tempC = input.nextDouble();
			TempC(tempC);
			System.out.println("Essa temperatura em F° é: " + TempC(tempC));
			break;
		case 2:
			System.out.println("Digite a temperatura em F°");

			double tempF = input.nextDouble();
			TempF(tempF);
			System.out.println("Essa temperatura em C° é: " + TempF(tempF));
			break;

		}

		input.close();
	}
	
	/**
	 * @author Elias
	 * funcao para coversao de temper
	 * 
	 */

	public static double TempC(double c) {

		return (c * 9 / 5) + 32;

	}

	public static double TempF(double f) { 

		return (f - 32) * 5 / 9;

	}

}
