package Funcoes;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o numero a ser fatorado");
		
		int numero = input.nextInt();
		int fatorado = fatorial(numero);
		
		System.out.println("O resultado do fatorial é: " + fatorado);

	}
	
	
	public static int fatorial(int numero) {
		
	if(numero == 0 || numero == 1) {
		return 1;
	}else {
		return numero * fatorial(numero - 1);
	}
		
	}

}
