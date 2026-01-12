package Funcoes;

import java.util.Scanner;

public class ParametrosFuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		soma(1, 4);
		soma(45, 67);

		System.out.println("Digite os valores para a soma!");

		System.out.println("Digite o 1°");
		int valorUm = input.nextInt();

		System.out.println("Digite o 2°");
		int valorDois = input.nextInt();

		soma(valorUm, valorDois);

		input.close();

	}

	public static void soma(int numUm, int numDois) {

		int soma = numUm + numDois;

		System.out.println("A soma é: " + soma);

	}

}
