package Loops;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escreva um programa que receba um numero do usuario e use um loop for para
		 * identificar se ele é primo!
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = input.nextInt();
		
		boolean ePrimo = true; 
		input.close();
		
		
		for(int i = 2; i < valor; i++) {
			
			if(valor % i == 0) {
				ePrimo = false;
				break;
			}
		}
		
		if(ePrimo) {
			System.out.println(valor + " é primo");
		}else {
			System.out.println(valor + " nao é primo");
		}
	}

}
