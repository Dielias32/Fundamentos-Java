package Funcoes;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade!");
		
		int idade = scanner.nextInt();
		validarIdade(idade);
		
		
		
		scanner.close();
		
		

	}
	
	
	public static void validarIdade(int idade) {
		
		if(idade < 18) {
			System.out.println("Acesso negado!!!");
			System.exit(0);
		}
		
		System.out.println("Acesso permitido");
	}

	
}
