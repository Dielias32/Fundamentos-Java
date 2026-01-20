package Loops;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que exiba um menu interativousando do-while, permitindo ao
		 * usuario escolher opcoes ate ele decida sair!
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha uma opcao no menu e clique zero para sair!");
		int entrada;
		
		do {
			
			System.out.println("Menu:\n 1 Agua \n 2 Refrigerante \n 3 Suco \n 0 Para sair!");
			entrada = input.nextInt();
			
			if (entrada == 1) {
				System.out.println("opcao 1: Agua");
			} else if (entrada == 2) {
				System.out.println("opcao 2: Refrigerante");
			} else if (entrada == 3) {
				System.out.println("opcao 3: Suco");
			}


		} while (entrada!= 0);

		System.out.println("Vc escolheu sair!!");
		
		input.close();
		
	}

}
